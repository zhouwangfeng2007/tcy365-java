/*
 *	focus add
 */

$.fn.focusAdd = function () {

    var FocusAdd = {
        init: function () {
            this._upLoadEvt();
            this._removeImg();
            this._closeFrame();
            this._saveForm();
        },
        // 图片上传触发
        _upLoadEvt: function () {
            var self = this;
            $('.J_UploadImg').on('change', function (ev) {
                var index = $("#txtID").val();
                self._upLoadImg(index);
            });
        },
        // 检查图片后缀名
        _checkImgExt: function (o) {
            var AllowExt = ".jpg, .png, .gif, .jpeg";
            var FileExt = o.substr(o.lastIndexOf(".")).toLowerCase();
            return AllowExt.indexOf(FileExt) < 0 ? false : true;
        },
        // 上传图片
        _upLoadImg: function (index) {
            var self = this;

            var imgVal = $("#uploadfile").val();
            if (imgVal.length == 0) {
                alert('请选择图片上传！');
                return false;
            } else {
                if (!self._checkImgExt(imgVal)) {
                    alert('仅支持jpg、gif和png图片文件！');
                    return false;
                }
            }

            $("#showImg").attr("src", "");
            parent.$(".J_PcImg" + index).val("");

            $("#div_thumbnail").addClass("loading");
            var options = {
                type: 'post',
                error: function (d) {
                    alert('图片上传失败，请重试！');
                    self._setDefaultImg(index);
                },
                success: function (data, status) {
                    if (data.indexOf('http://') > -1) {
                        self._setUploadImg(data, index);
                    } else {
                        self._setDefaultImg(index);
                    }
                }
            };

            $('#form_upload').ajaxSubmit(options);
        },
        // 预览上传成功图片
        _setUploadImg: function (data, index) {
            $("#div_thumbnail").removeClass("loading");
            $("#showImg").attr("src", data);
            $(".J_PcImg" + index).val(data);
            // 处理放置图片路径隐藏域
            this._setImgInput(index);
        },
        // 设置默认显示图片
        _setDefaultImg: function (index) {
            $("#showImg" + index).attr("src", '/assets/images/default.gif');
            $("#div_thumbnail").removeClass("loading");
            // 处理放置图片路径隐藏域
            this._setImgInput(index);
        },
        // 设置图片隐藏域
        _setImgInput: function (index) {
            var pcImg = $('#showImg').attr('src');
            if (pcImg.indexOf('http://') > -1) {
                parent.$(".J_PcImg" + index).val(pcImg);
            } else {
                parent.$(".J_PcImg" + index).val("");
            }
        },
        // 移除已上传图片
        _removeImg: function () {
            var self = this;
            $('.thumbnail').on('mouseenter mouseleave', function (ev) {
                var target = $(this),
						oImg = $('img', target),
						src = oImg.attr('src'),
						oBtn = $('.J_RemoveImg', target);
                if (src == '' || src.indexOf('default.gif') > -1) return;
                ev.type === 'mouseenter' ? oBtn.show() : oBtn.hide();
            });
            $(document).delegate('.J_RemoveImg', 'click', function (ev) {
                var target = $(this);
                target.hide().siblings('img').attr('src', '/assets/images/default.gif');
                $(this).parent('.thumbnail').siblings('.uploading').children('input').val('');
                var index = $("#txtID").val();
                parent.$(".J_PcImg" + index).val("");
                self._setImgInput();
            });
        },

        // 提交表单
        _saveForm: function () {
            var self = this;
            $('#J_FocusForm').on('submit', function (ev) {
                ev.preventDefault();
                $(this).ajaxSubmit({
                    type: 'post',
                    beforeSubmit: function (formData, jqForm, options) {
                        if (!self._checkForm()) {
                            return false;
                        };
                    },
                    success: function (r, statusText, xhr, $form) {
                        if (r.error) {
                            alert(r.msg);
                        } else {
                            alert('保存成功！');
                            window.parent.location.reload();
                        }
                    }
                });
                return false;
            })
        },

        // 关闭窗口
        _closeFrame: function () {
            $(document).delegate('.J_CloseFrame', 'click', function (ev) {
                $('.J_CloseFrame', window.parent.document).trigger('click');
            });
        }
    }

    return FocusAdd.init();

}