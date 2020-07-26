(function($) {
    'use strict';
    /**
     * 为不支持placeholder的浏览器添加替代方案
     */
    function isNotSupportPlaceholder() {
        var attr = "placeholder";
        var input = document.createElement("input");
        return !(attr in input);
    }
    var $searchInput = $('.search-box input');
    var placetext = $searchInput.attr("placeholder");
    if (isNotSupportPlaceholder()) {
        $searchInput.focus(function() {
            if ($searchInput.val() === placetext) {
                $searchInput.val('');
            }
        }).blur(function() {
            if ($searchInput.val() === '') {
                $searchInput.val(placetext);
            }
        }).val('搜索您家乡的棋牌游戏');
    }
    /** 搜索功能 */
    $('.search-btn').click(function() {
        if ($searchInput.val() === '' || $searchInput.val() === placetext) return $searchInput.focus();
        window.open('http://www.tcy365.com/gamesearch/gamesearch.html?gstr=' + $searchInput.val());
    });
    /** 友情链接tab切换 */
    var friendLinkList = $('.friend-link-list');
    friendLinkList.eq(0).css('display', 'block');
    var friendLinkTabs = $('.friend-link-tabs li');
    $('.friend-link-tabs').on('click', 'li:not(.active)', function() {
        var $this = $(this);
        $this.addClass('active').siblings().removeClass('active');
        var index = friendLinkTabs.index($this);
        friendLinkList.eq(index).css('display', 'block').siblings('.friend-link-list').css('display', 'none');
    });
    /** fix ie hover */
    if ($.browser.msie && $.browser.version === '6.0') {
        $('.nav .more').hover(function () {
            $(this).find('.child-list').css('display', 'block');
        }, function () {
            $(this).find('.child-list').css('display', 'none');
        });
    }
})(jQuery);
