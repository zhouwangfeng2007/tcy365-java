<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.tcy365.common.bizEnum.IsVisible" %>
<%@ page import="org.apache.commons.lang.StringEscapeUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title> 编辑分站 </title>
    <script src="/assets/Scripts/jquery/jquery-1.8.2.min.js"></script>
    <script src="/assets/Scripts/artDialog/dialog.min.js"></script>
    <link href="/assets/dskin/dui.css" rel="stylesheet"/>
    <script src="/assets/dskin/js/DUI.js"></script>
    <script src="/assets/Scripts/tcy365.js"></script>
    <script src="/assets/ueditor-utf8-net/ueditor.config.js"></script>
    <script src="/assets/ueditor-utf8-net/ueditor.all.js"></script>
    <script src="/assets/ueditor-utf8-net/lang/zh-cn/zh-cn.js"></script>
    <link href="/assets/CSS/common.css" rel="stylesheet"/>
    <script>
        var ueContent = UE.getEditor('friendlinks', {
            toolbars: [
                ['source', '|', 'undo', 'redo', '|',
                    'bold', 'italic', 'underline', 'fontborder',
                    'link', 'unlink']
            ],
            autoHeightEnabled: true,
            autoFloatEnabled: true,
            initialFrameWidth: null
        });

        function setUeditor() {
            ueContent.execCommand('source');
            return true;
        }</script>
</head>
<body>
<div class="p10">
    <form method="post" action="/WebSite/updateweb" id="listForm">
        <div class="d-panel">
            <h3 class="arrow"><strong>分站基本信息 </strong></h3>
            <div class="content">
                <div class="p5 clearfix">
                    <label class="col-lab w-1"><span class="red">*</span>分站名称：</label>
                    <input name="webname" type="text" id="webname" class="d-form-input w-7 fl" value="${web.webname}"/>
                    <span class="col-lab pl5 red txtWebName_tip"></span>
                </div>
                <div class="p5 clearfix">
                    <label class="col-lab w-1"><span class="red">*</span>分站域名：</label>
                    <span class="col-lab">www.tcy365.com/</span>
                    <input name="webdomain" type="text" id="webdomain" value="${web.webdomain}"
                           class="d-form-input w-3 fl"/>
                    <span class="col-lab pl5 red txtWebDomain_tip"></span>
                </div>
                <div class="p5 clearfix">
                    <label class="col-lab w-1"><span class="red">*</span>对应地区：</label>
                    <select name="ddlProvince" id="ddlProvince" class="d-form-select fl mr5">
                        <option selected="selected" value="">请选择</option>
                    </select>
                    <select name="ddlCity" id="ddlCity" class="d-form-select fl mr5">
                        <option selected="selected" value="">请选择</option>
                    </select>
                    <select name="webarea" id="webarea" class="d-form-select fl">
                        <option selected="selected" value="">请选择</option>
                    </select>
                    <span class="col-lab pl5 red ddlCity_tip"></span>
                </div>
                <div class="p5 clearfix">
                    <label class="col-lab w-1"><span class="red">*</span>可见状态：</label>
                    <select id="isvisible" name="isvisible" class="d-form-select fl">
                        <option selected value="">请选择</option>
                        <c:forEach items='<%= IsVisible.values()%>' var="a" varStatus="idx">
                            <option value="${a.code}">${a.description}</option>
                        </c:forEach>
                    </select>
                    <span class="col-lab pl5 red ddlIsVisble_tip"></span>
                </div>
                <div class="p5 clearfix">
                    <label class="col-lab w-1"><span class="red">*</span>渠道ID：</label>
                    <input name="channelid" type="text" id="channelid" class="d-form-input w-3 fl"
                           value="${web.channelid}"
                           onkeyup="value=value.replace(/[^\d]/g,&#39;&#39;)"/>
                    <span class="col-lab pl5 red txtChannelId_tip"></span>
                </div>
            </div>
        </div>
        <div class="d-panel mt10">
            <h3><strong>分站SEO</strong></h3>
            <div class="content">
                <div id="tabs1">
                    <div class="d-tabs1">
                        <ul>
                            <li class="d-tabs-item" id="tab0"><span>PC站首页TKD</span></li>
                            <li class="d-tabs-item"><span>移动站首页TKD</span></li>
                        </ul>
                    </div>
                    <div>
                        <div class="d-tabs-view">
                            <div class="p5 clearfix">
                                <label class="col-lab w-1"><span class="red">*</span>Title：</label>
                                <input name="title" type="text" id="title" value='${web.title}'
                                       class="d-form-input w-7 fl"/>
                                <span class="col-lab pl5 red txtTitle_tip"></span>
                            </div>
                            <div class="p5 clearfix">
                                <label class="col-lab w-1"><span class="red">*</span>keywords：</label>
                                <input name="keywords" type="text" id="keywords" value='${web.keywords}'
                                       class="d-form-input w-7 fl"/>
                                <span class="col-lab pl5 red txtKeyWords_tip"></span>
                            </div>
                            <div class="p5 clearfix">
                                <label class="col-lab w-1"><span class="red">*</span>Description：</label>
                                <input name="description" type="text" id="description" value='${web.description}'
                                       class="d-form-input w-7 fl"/>
                                <span class="col-lab pl5 red txtDescription_tip"></span>
                            </div>
                        </div>
                        <div class="d-tabs-view">
                            <div class="p5 clearfix">
                                <label class="col-lab w-1">Title：</label>
                                <input name="mTitle" type="text" id="mTitle" value='${mobileTkd.title}'
                                       class="d-form-input w-7 fl"/>
                            </div>
                            <div class="p5 clearfix">
                                <label class="col-lab w-1">keywords：</label>
                                <input name="mKeyWords" type="text" id="mKeyWords" value='${mobileTkd.keywords}'
                                       class="d-form-input w-7 fl"/>
                            </div>
                            <div class="p5 clearfix">
                                <label class="col-lab w-1">Description：</label>
                                <input name="mDescription" type="text" id="mDescription"
                                       value='${mobileTkd.discription}'
                                       class="d-form-input w-7 fl"/>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="p5 clearfix">
                    <label class="col-lab w-1">友情链接：</label>
                    <textarea name="friendlinks" id="friendlinks" class="d-form-textarea w-7 fl" rows="5">
                        <c:if test="${web!=null}">
                            ${web.friendlinks}
                        </c:if>
                    </textarea>
                    <span class="col-lab pl5 red txtFriendLink_tip"></span>
                </div>
                <div class="p5 clearfix">
                    <label class="col-lab w-1">统计代码：</label>
                    <textarea name="indexstatjs" rows="2" cols="20" id="indexstatjs" class="d-form-textarea w-7 fl">
                      <c:if test="${web!=null}">
                          ${web.indexstatjs}
                      </c:if>
                    </textarea>
                    <span class="col-lab pl5 red txtIndexStatJs_tip"></span>
                </div>
            </div>
        </div>
        <div class="p10 tr">
            <input type="hidden" id="id" name="id" value="${id}">

            <input type="submit" name="btnSaveWeb" value="确认提交" id="btnSaveWeb"
                   class="d-button d-button-blue"/>
        </div>
    </form>
</div>

<script src="http://static.uc108.com/common/ui/tabs/1.0/tabs.min.js"></script>
<script src="http://static.tcy365.com/common/ui/validator/1.0/validator.min.js"></script>
<script>

    var isVisible = "${web.isvisible}";
    var webGrade = "${web.webgrade}";
    var webarea = "${web.webarea}";

    $(document).ready(function () {
        $.get("/area/getallprovince", function (result) {
            var provinceArray = result.data;
            $("#ddlProvince").empty();
            const opt = $("<option selected value=''>请选择</option>");
            $("#ddlProvince").append(opt);
            $.each(provinceArray, function (index, item) {
                const opt = $("<option value=" + item.id + ">" + item.name + "</option>");
                $("#ddlProvince").append(opt)
            });
        });

    });


    $("#ddlProvince").on("change",
        function () {
            var url = "/area/getcity/" + $("#ddlProvince").val();
            $.get(url, function (result) {
                $("#ddlCity").empty();
                $("#ddlCity").append("<option selected value=''>请选择</option>");
                $("#ddlCounty").empty();
                $("#ddlCounty").append("<option selected value=''>请选择</option>");

                $.each(result.data, function (index, item) {
                    $("#ddlCity").append("<option value=" + item.id + ">" + item.name + "</option>")
                });
            });

        });

    $("#ddlCity").on("change",
        function () {
            var url = "/area/getdistrict/" + $("#ddlCity").val();
            $.get(url, function (result) {
                // console.log(result);
                $("#webarea").empty();
                const opt = $("<option selected value=''>请选择</option>");
                $("#webarea").append(opt);
                $.each(result.data, function (index, item) {
                    const opt = $("<option value=" + item.id + ">" + item.name + "</option>");
                    $("#webarea").append(opt)
                });
            });

        });


    $(".changevisible").click(function () {
        console.log();
        $.ajax({
            url: "/web/changevisible",
            data: "id=" + $(this).attr("wid") + "&isvisible=" + $(this).attr("vvid"),
            type: "POST",
            dataType: "json",
            success: function (data) {
                // data = jQuery.parseJSON(data);  //dataType指明了返回数据为json类型，故不需要再反序列化
                // console.log(data);
                if (data.code == 0) {
                    window.location = window.location;
                } else {
                    alert(data.msg);
                }
            }
        });
    });


</script>
<script>


    $("#tabs1").tabs({autoFade: false, eventName: 'click'});
    $.validator.formConfig({
        formID: "listForm", successEnd: function (o) {
            setUeditor();
            return true;
        }
    });
    $("#listForm").validator({
        webname: {msgRequired: "请输入分站名称"},
        webdomain: {msgRequired: "请输入分站域名"},
        isVisble: {msgRequired: "请选择可见状态"},
        channelid: {msgRequired: "请输入渠道ID"}
    });

    function valid() {
        var t = $("#title").val();
        if (t == "") {
            $(".txtTitle_tip").text("请填写PC站Title");
            $("#tab0").click();
            return false;
        }

        if (t.length >= 100) {
            $(".txtTitle_tip").text("最多100个字");
            $("#tab0").click();
            return false;
        }
        $(".txtTitle_tip").text("");
        var k = $("#keywords").val();
        if (k == "") {
            $(".txtKeyWords_tip").text("请填写PC站KeyWords");
            $("#tab0").click();
            return false;
        }
        if (k.length >= 150) {
            $(".txtKeyWords_tip").text("最多150个字");
            $("#tab0").click();
            return false;
        }
        $(".txtKeyWords_tip").text("");
        var d = $("#description").val();
        if (d == "") {
            $(".txtDescription_tip").text("请填写PC站Description");
            $("#tab0").click();
            return false;
        }
        if (d.length >= 200) {
            $(".txtDescription_tip").text("最多200个字");
            $("#tab0").click();
            return false;
        }
        $(".txtDescription_tip").text("");
        return true;
    }
</script>
</body>
</html>

