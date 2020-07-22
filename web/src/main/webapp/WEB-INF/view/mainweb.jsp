<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>

<%@ include file="Layout/mainwebfx.jsp" %>

<rapid:override name="mainBody">
    <div class="content">
        <div class="section">
            <ul class="banner-order" id="J_bannerNum"></ul>
            <div class="index-banner-b slider" id="bannerSlide">
                <c:choose>
                    <c:when test="${ListHelper.IsEmpty(ListPcBanner)}">
                        <ul class="banner-list" id="J_bannerItems">
                            <li style="opacity: 0; z-index: 1;" class="J_banner1"><img
                                    src="//static.tcy365.com/uc/tcy/static/assets/images/ac-banner1.jpg?v=${BizParam.ResourceVersion}"
                                    alt="" width="1920px" height="300px"/></li>
                        </ul>
                    </c:when>
                    <c:otherwise>
                        <ul class="banner-list" id="J_bannerItems">
                            <c:forEach items="${ListPcBanner}" var="b" varStatus="xh">
                                <c:choose>
                                    <c:when test="${b.LinkUrl==null||b.LinkUrl==''}">
                                        <li style="opacity: 0; z-index: 1;" class="J_banner${xh.index}"><img
                                                src="${b.ImageRelativePath}"
                                                alt="${b.ImageTag}" title="${b.ImageTag}"
                                                width="1920" height="300"/></li>
                                    </c:when>
                                    <c:otherwise>
                                        <li style="opacity: 0; z-index: 1;" class="J_banner${xh.index}"><a
                                                href="${b.LinkUrl}"><img
                                                src="${b.ImageRelativePath}" alt="${b.ImageTag}" title="${b.ImageTag}"
                                                width="1920" height="300"/></a>
                                        </li>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                        </ul>
                    </c:otherwise>
                </c:choose>
            </div>
            <div class="download-box">
                <h3>
                    <a href="javascript:;" class="active">电脑版下载</a>
                    <a href="javascript:;">手机版下载</a>
                </h3>
                <ul class="download-box-list" style="display: block;">
                    <a href="/hall/downloadhall.html?webid=@Model.CurrentWeb.Id" id="btnhall2" rel="nofollow"
                       class="download-btn J_download-btn" title="同城游大厅(电脑版)">2亿人的选择</a>
                    <p class="download-info">版本：V28.5 大小：13.8M 更新时间：2017-10-08</p>
                </ul>
                <ul class="download-box-list">
                    <div class="download-code"></div>
                    <div class="download-text">扫描二维码下载同城游</div>
                </ul>
            </div>
        </div>
        <c:choose>
            <c:when test="${ListRecommendGdpInfo!=null&&ListRecommendGdpInfo.size()>=0}">
                <div class="section">
                    <h2 class="title">本地热门</h2>
                    <ul class="local-hot clearfix">
                        <c:forEach items="${ListRecommendGdpInfo}" var="g" varStatus="xh">
                            <li>
                                <div class="hot-game-box J_hot${xh.index}">
                                    <a href="/game/d${g.GameShort}${g.Id}.html" target="_blank">
                                        <img src="${PcGameImageWeb}/game/pic/${g.GameShort}_108.png"
                                             alt="${g.GameName}"/>
                                    </a>
                                    <h3><a href="/game/d${g.GameShort}${g.Id}.html" target="_blank"
                                           class="hot-game-title"
                                           title="${g.GameName}">${g.GameName}</a></h3>
                                </div>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </c:when>
            <c:otherwise>
            </c:otherwise>
        </c:choose>

        <div class="section clearfix">
            <div class="fl index-news">
                <h2 class="title">
                    资讯<a href="/news/" class="more" title="更多同城游资讯">更多</a>
                </h2>
                <div class="index-banner-zx">
                    <c:choose>
                        <c:when test="${Activity==null||Activity.size()<=0}">
                            <a href="/news/" target="_blank" title="全部同城游资讯">
                                <img src="//static.tcy365.com/uc/tcy/static/assets/images/news-ad-img.jpg?v=${BizParam.ResourceVersion}"
                                     width="190px" height="223px">
                            </a>
                        </c:when>
                        <c:otherwise>
                            <ul>
                                <c:forEach items="${Activity}" var="activity">
                                    <c:choose>
                                        <c:when test="${activity.LinkUrl==null||activity.LinkUrl==''}">
                                            <li>
                                                <img src="${activity.ImageRelativePath}" title="${activity.ImageTag}"
                                                     width="190px" height="223px">
                                            </li>
                                        </c:when>
                                        <c:otherwise>
                                            <li>
                                                <a href="${activity.LinkUrl}" target="_blank"
                                                   title="${activity.ImageTag}">
                                                    <img src="${activity.ImageRelativePath}" width="190px"
                                                         height="223px">
                                                </a>
                                            </li>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </ul>
                        </c:otherwise>
                    </c:choose>
                </div>

                <div class="news-box fl">
                    <c:choose>
                        <c:when test="${ListPcNews==null||ListPcNews.size()<=0}">
                            <ul class="news-list">
                                <c:forEach items="${ListPcNews}" var="n">
                                    <li>
                                        <a class="green" href="@(ConvertConstValue.ConvertNewsClassLink(n.NewsClass) )"
                                           target="_blank">[@(ConvertConstValue.ConvertNewsClass(n.NewsClass))]</a>
                                        <a href="/news/d${n.Id }.html" class="news-item-link"
                                           target="_blank">${n.Title}</a>
                                        <span class="fr">${n.AddTime}</span>
                                    </li>
                                </c:forEach>
                            </ul>
                        </c:when>
                        <c:otherwise>
                        </c:otherwise>
                    </c:choose>
                </div>
            </div>

            <div class="fl index-vip">
                <h2 class="title">
                    会员<a href="http://vip.tcy365.com/" class="more" rel="nofollow">更多</a>
                </h2>
                <div class="vip-slider slider">
                    <ul>
                        <li>
                            <a href="http://vip.tcy365.com/" target="_blank" rel="nofollow">
                                <img src="@(BizParam.WebResourceUrl)/uc/tcy/static/assets/images/vip-p1.jpg?v=@(BizParam.ResourceVersion)"
                                     alt="马上开通蓝钻会员，开始精彩体验吧！" title="马上开通蓝钻会员，开始精彩体验吧！"/>
                            </a>
                        </li>
                    </ul>
                    <div class="vip-slider-ctrl">
                        <a href="javascript:void(0);" class="prev arrow">&lt;</a>
                        <span class="vip-slider-title">马上开通蓝钻会员，开始精彩体验吧！</span>
                        <a href="javascript:void(0);" class="next arrow">&gt;</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="section">
            <h2 class="title">商城<a href="http://shop.tcy365.com/" class="more" target="_blank" rel="nofollow">更多</a>
            </h2>
            <ul class="mall-list clearfix">
                <li class="mall-item item1">
                    <a href="//shop.tcy365.com/goods/details/?id=234&sid=798" target="_blank" rel="nofollow">
                        <h6>张大佛爷</h6>
                        <p class="description">红雪冬青一袭水袖丹衣 </p>
                        <span class="icon-jumpout">→</span>
                        <img src="//static.tcy365.com/uc/tcy/static/assets/images/mall-item.png?v=${BizParam.ResourceVersion}"
                             alt="" class="mall-item-img"/>
                    </a>
                </li>
                <li class="mall-item item2">
                    <a href="//shop.tcy365.com/goods/details/?id=231&sid=793" target="_blank" rel="nofollow">
                        <h6>金粉伊人</h6>
                        <p class="description">红裳如火美人笑 </p>
                        <span class="icon-jumpout">→</span>
                        <img src="//static.tcy365.com/uc/tcy/static/assets/images/mall-item-2.png?v=@(BizParam.ResourceVersion)"
                             alt="" class="mall-item-img"/>
                    </a>
                </li>
                <li class="mall-item item3">
                    <a href="//shop.tcy365.com/goods/details/?id=235&sid=834" target="_blank" rel="nofollow">
                        <h6>甜心兔女郎</h6>
                        <p class="description">千娇百媚，天生尤物 </p>
                        <span class="icon-jumpout">→</span>
                        <img src="//static.tcy365.com/uc/tcy/static/assets/images/mall-item-3.png?v=@(BizParam.ResourceVersion)"
                             alt="" class="mall-item-img"/>
                    </a>
                </li>
                <li class="mall-item item4">
                    <a href="//shop.tcy365.com/goods/details/?id=3&sid=10" target="_blank" rel="nofollow">
                        <h6>007</h6>
                        <p class="description">我不是别人，我是007 </p>
                        <span class="icon-jumpout">→</span>
                        <img src="//static.tcy365.com/uc/tcy/static/assets/images/mall-item-4.png?v=@(BizParam.ResourceVersion)"
                             alt="" class="mall-item-img"/>
                    </a>
                </li>
            </ul>
        </div>
        <div class="section game-list">
            <h2 class="title">游戏列表<a href="/game/" class="more" title="更多游戏">更多</a></h2>
            <div class="game-list-box clearfix">
                <dl>
                    <dt class="game-list-title"><a href="/game/cards/" target="_blank">扑克牌游戏</a></dt>
                    <dd>
                        <ul>
                            <c:forEach items="${ListPaiLeiGdpInfo}" var="g">
                                <li>
                                    <div class="game-item-title">${g.GameName}</div>
                                    <div class="game-item-detail">
                                        <a class="game-item-detail-icon" target="_blank"
                                           href="/game/d${g.GameShort}${g.Id}.html"><img
                                                src="${BizParam.PcGameImageWeb}/game/pic/${g.GameShort}_108.png" alt=""></a>
                                        <a class="game-item-detail-title" target="_blank"
                                           href="/game/d${g.GameShort}${g.Id}.html"
                                           title="${g.GameName}">${g.GameName}</a>
                                        <a class="game-item-detail-btn" target="_blank"
                                           href="/game/d${g.GameShort}${g.Id}.html">查看详情</a>
                                    </div>
                                </li>
                            </c:forEach>
                        </ul>
                    </dd>
                </dl>
                <dl>
                    <dt class="game-list-title"><a href="/game/cmahjong/" target="_blank">麻将游戏</a></dt>
                    <dd>
                        <ul>
                            <c:forEach items="${ListMaJiangGdpInfo}" var="g">
                                <li>
                                    <div class="game-item-title">${g.GameName}</div>
                                    <div class="game-item-detail">
                                        <a class="game-item-detail-icon" target="_blank"
                                           href="/game/d${g.GameShort}${g.Id}.html"><img
                                                src="${BizParam.PcGameImageWeb}/game/pic/${g.GameShort}_108.png" ,
                                                alt=""></a>
                                        <a class="game-item-detail-title" target="_blank"
                                           href="/game/d${g.GameShort}${g.Id}.html"
                                           title="${g.GameName}">${g.GameName}</a>
                                        <a class="game-item-detail-btn" target="_blank"
                                           href="/game/d${g.GameShort}${g.Id}.html">查看详情</a>
                                    </div>
                                </li>
                            </c:forEach>
                        </ul>
                    </dd>
                </dl>
                <dl>
                    <dt class="game-list-title"><a href="/game/chess/" target="_blank">棋类游戏</a></dt>
                    <dd>
                        <ul>
                            <c:forEach items="${ListQiLeiGdpInfo}" var="g">
                                <li>
                                    <div class="game-item-title">${g.GameName}</div>
                                    <div class="game-item-detail">
                                        <a class="game-item-detail-icon" target="_blank"
                                           href="/game/d${g.GameShort}${g.Id}.html"><img
                                                src="${ BizParam.PcGameImageWeb}/game/pic/${g.GameShort}_108.png"
                                                alt=""></a>
                                        <a class="game-item-detail-title" target="_blank"
                                           href="/game/d${g.GameShort}${g.Id}.html"
                                           title="${g.GameName}">${g.GameName}</a>
                                        <a class="game-item-detail-btn" target="_blank"
                                           href="/game/d${g.GameShort}${g.Id}.html">查看详情</a>
                                    </div>
                                </li>
                            </c:forEach>
                        </ul>
                    </dd>
                </dl>
                <dl class="last">
                    <dt class="game-list-title"><a href="/game/casual/" target="_blank">休闲游戏</a></dt>
                    <dd>
                        <ul>
                            <c:forEach items="${ListXiuXianGdpInfo}" var="g">
                                <li>
                                    <div class="game-item-title">${g.GameName}</div>
                                    <div class="game-item-detail">
                                        <a class="game-item-detail-icon" target="_blank"
                                           href="/game/d${g.GameShort}${g.Id}.html"><img src="${ BizParam.PcGameImageWeb}/game/pic/${g.GameShort}_108.png",
                                            alt=""></a>
                                        <a class="game-item-detail-title" target="_blank"
                                           href="/game/d${g.GameShort}${g.Id}.html" title="${g.GameName}">${g.GameName}</a>
                                        <a class="game-item-detail-btn" target="_blank"
                                           href="/game/d${g.GameShort}${g.Id}.html">查看详情</a>
                                    </div>
                                </li>
                            </c:forEach>

                        </ul>
                    </dd>
                </dl>
            </div>
        </div>
    </div>
</rapid:override>

<%@ include file="Layout/FriendLink.jsp" %>