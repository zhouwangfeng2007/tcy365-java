<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>${Title}</title>
    <link rel="shortcut icon" href="${BizParam.WebResourceUrl}/uc/common/images/favicon.ico"/>
    <meta name="keywords" content="${KeyWords}"/>
    <meta name="description" itemprop="description" content="${Description}"/>
    <c:if test="${MetaMobileUrl!=''}">
        <meta name="mobile-agent" content="format=html5;url=${MetaMobileUrl}"/>
        <meta name="applicable-device" content="pc">
        <meta http-equiv="Cache-Control" content="no-siteapp"/>
        <meta http-equiv="Cache-Control" content="no-transform"/>
        <link rel="alternate" media="only screen and (max-width:750px)" href="${MetaMobileUrl}"/>
    </c:if>
    <!--修改部分 v 5.0.0 app.css 改成 5.0.0-->
    <link href="//static.tcy365.com/uc/tcy/static/assets/css/main-v5.0.0.css?v=${ResourceVersion}" rel="stylesheet"
          type="text/css"/>
    <meta itemprop="name" content="同城游棋牌官方下载"/>
    <meta itemprop="image" content="//static.tcy365.com/uc/common/images/logo/logo_v_48.png"/>
    <rapid:block name="headcss"></rapid:block>
    <rapid:block name="headjs"></rapid:block>

    <script>
        var TCY_DATASIGN = {
            ip: '@ViewBag.ClientIp',
            appSessionId: '@ViewBag.AppSessionId',
            eventSessionId: '@ViewBag.EventSessionId'
        };
    </script>
</head>

<body class="yahei">
<div class="header">
    <div class="top-navigation">
        <div id="TCYSiteNav"></div>
    </div>
    <div class="logo-cn">
        <div class="search-box">
            <input type="text" placeholder="搜索您家乡的棋牌游戏" maxlength=10>
            <a href="javascript:;" class="search-btn J_search-btn"></a>
            <div class="search-list">
                <div class="search-pop search-pop-mate" style="display:block">
                    <h3>猜你想搜</h3>
                    <ul class="search-mate">
                    </ul>
                </div>
                <div class="search-pop search-pop-record">
                    <h3>历史搜索</h3>
                    <ul class="search-history">
                    </ul>
                    <p>
                        <i></i>
                        <a href="javascript:;" class="clear-history-record">清空历史记录</a>
                    </p>
                </div>
                <div class="search-pop search-pop-hot"
                     style="display: ${pcSearchRecGameList.Count > 0 ? "block" : "none"}">
                    <h3>热门搜索推荐</h3>
                    <ul class="search-recommend">
                        <c:forEach items="${pcSearchRecGameList}" var="pcSearchRecGame">
                            <li><a href="javascript:;">${pcSearchRecGame.GameName}</a></li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
        <c:choose>
            <c:when test="${isSpaceialWeb == false}">
                <ul class="nav yahei">
                    <li><a href="${currentWeb.WebDomain!=null ? currentWeb.WebDomain : '/'}"
                           title="首页" ${SelIndex == 1 ? "class=\"opt\"" : ""}>首页</a></li>
                    <li>
                        <span class="more">
                            <a href="/game/" ${SelIndex == 2 ? "class=\"opt\"" : ""} target="_blank" title="游戏">游戏<i
                                    class="icon-more"></i></a>
                            <ul class="child-list">
                                <li><a href="/game/cards/" rel="nofollow" target="_blank" title="扑克牌游戏">扑克牌游戏</a></li>
                                <li><a href="/game/cmahjong/" rel="nofollow" target="_blank" title="麻将游戏">麻将游戏</a></li>
                                <li><a href="/game/chess/" rel="nofollow" target="_blank" title="棋类游戏">棋类游戏</a></li>
                                <li><a href="/game/casual/" rel="nofollow" target="_blank" title="休闲游戏">休闲游戏</a></li>
                            </ul>
                        </span>
                    </li>
                    <li><a href="/app/" ${SelIndex == 3 ? "class=\"opt\"" : ""} target="_blank" title="手游">手游</a></li>
                    <li><a href="http://www.yaodou.com/" rel="nofollow" target="_blank" title="页游">页游</a></li>
                    <li><a href="http://pay.tcy365.com/" rel="nofollow" target="_blank" title="充值">充值</a></li>
                    <li><a href="http://kf.tcy365.com/" rel="nofollow" target="_blank" title="客服">客服</a></li>
                    <li>
                        <span class="more">
                            <a href="#" title="更多">更多<i class="icon-more"></i></a>
                            <ul class="child-list">
                                <li><a href="http://user.tcy365.com/" rel="nofollow" target="_blank"
                                       title="用户中心">用户中心</a></li>
                                <li><a href="/top/" target="_blank" title="游戏排行榜">游戏排行榜</a></li>
                                <li><a href="/brand/" rel="nofollow" target="_blank" title="品牌">品牌</a></li>
                                <li><a href="/yxgl/" target="_blank" title="资讯精选">资讯精选</a></li>
                            </ul>
                        </span>
                    </li>
                </ul>
            </c:when>
            <c:otherwise>
                <ul class="nav yahei">
                    <li><a href="${currentWeb.WebDomain!=null ?  "/${currentWeb.WebDomain}/"  : "/"}"
                           title="首页" ${SelIndex == 1 ? "class=\"opt\"" : ""}>首页</a></li>
                    <li><a href="http://kf.tcy365.com/" rel="nofollow" target="_blank" title="客服">客服</a></li>
                    <li><a href="http://vip.tcy365.com/" rel="nofollow" target="_blank" title="会员">会员</a></li>
                    <li>
                        <span class="more">
                            更多<i class="icon-more"></i>
                            <ul class="child-list">
                                <li><a href="http://user.tcy365.com/" rel="nofollow" target="_blank"
                                       title="用户中心">用户中心</a></li>
                                <li><a href="/yxgl/" target="_blank" title="资讯精选">资讯精选</a></li>
                            </ul>
                        </span>
                    </li>
                </ul>
            </c:otherwise>
        </c:choose>


        <div class="logo">
            <div><a href="/" target="_blank" title="同城游戏大厅"></a></div>
        </div>

    </div>
</div>
<rapid:block name="mainBody"></rapid:block>

<div id="ConsultingService" class="ConsultingService">
    <a href="http://talk.tcy365.org:1505/client/?f=2"
       class="big-icon J_talk" target="_blank"><i class="talk-title"></i><span class="toggle-btn">&#215;</span></a>
    <span class="small-icon"></span>
</div>

<div class="footer">
    <div class="Anti-addiction">
        <p>抵制不良游戏 拒绝盗版游戏 注意自我保护 谨防受骗上当 适度游戏益脑 沉迷游戏伤身 合理安排时间 享受健康生活 —— 《健康游戏忠告》</p>
    </div>
    <div class="about-us clearfix">
        <span class="logo" title="同城游"></span>
        <ul>
            <li><a href="/help/intro.html" rel="nofollow" title="本站简介" target="_blank">本站简介</a></li>
            <li><a href="/help/cooperate.html" rel="nofollow" title="商务合作" target="_blank">商务合作 </a></li>
            <li><a href="/help/contact.html" rel="nofollow" title="联系我们" target="_blank">联系我们</a></li>
            <li class="last"><a href="http://www.ct108.com/" rel="nofollow" title="畅唐网络" target="_blank">畅唐网络</a></li>
        </ul>
    </div>
    <p class="right-declare">
        <span>COPYRIGHT &copy; @(DateTime.Now.Year) TOWNCHEER GAMES. ALL RIGHTS RESERVED. 浙江畅唐网络股份有限公司 &reg; 版权所有</span>
        <span>《中华人民共和国增值电信业务经营许可证》 编号：浙 B2-20090241</span>
        <span>《网络文化经营许可证》浙网文[2018]2411-151号</span>
        <span>《文网游备字》[2014]M-CBG136号</span>
        <a href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=33010802006433" rel="nofollow"
           target="_blank">
            <img src="http://www.beian.gov.cn/img/ghs.png" class="zgwab">浙公网安备 33010802006433号
        </a>
    </p>
    <div class="safe-grade-link">
        <a href="https://v.yunaq.com/certificate?domain=www.tcy365.com&from=label" rel="nofollow" target="_blank"><img
                src="https://aqyzmedia.yunaq.com/labels/label_sm_90030.png" height="37" alt=""></a>
        <a href="javascript:;" rel="nofollow" target="_blank"><img
                src="//static.tcy365.com/uc/tcy/static/assets/images/2.jpg?v=${BizParam.ResourceVersion}" alt=""></a>
        <a href="http://sq.ccm.gov.cn:80//ccnt/sczr/service/business/emark/gameNetTag/F35FC9BEF61352AEE040007F01003007"
           rel="nofollow" target="_blank"><img
                src="//static.tcy365.com/uc/tcy/static/assets/images/3.jpg?v=${BizParam.ResourceVersion}" alt=""></a>

    </div>
</div>

<script src="//static.tcy365.com/??cdn/jquery/1.8.2/jquery.js,cdn/dialog/1.4.0/dialog.js,cdn/messenger/2.0.0/messenger.js,cdn/component/slider/1.0.1/slider.min.js?v=@(BizParam.ResourceVersion)"
        type="text/javascript"></script>

<!--修改部分 v 5.0.0 app.js 和 trackevent.js 改成 5.0.0-->
<script src="//static.tcy365.com/??uc/tcy/static/assets/js/top/1.0.3/top.js,uc/tcy/static/assets/js/1.0.1/banner-slider.js,uc/tcy/static/assets/js/5.0.0/placeholder.js,uc/tcy/static/assets/js/5.0.0/app.js,uc/tcy/static/assets/js/5.0.0/trackevent.js,uc/tcy/static/assets/js/4.8.0/sliderGradual.min.js?v=@(BizParam.ResourceVersion)"></script>


<rapid:block name="footcss"></rapid:block>
<rapid:block name="footjs"></rapid:block>
<div style="display: none">
    ${IndexStatJs}
    <script src="https://s95.cnzz.com/z_stat.php?id=1261168349&web_id=1261168349" language="JavaScript"></script>
</div>
</body>
</html>