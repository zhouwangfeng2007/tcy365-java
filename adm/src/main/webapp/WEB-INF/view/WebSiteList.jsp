<%@ page import="com.tcy365.common.utils.ListHelper" %>
<%@ page import="java.util.List" %>
<%@ page import="com.tcy365.common.bizEnum.IsVisible" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>分站列表</title>
    <script src="../assets/Scripts/jquery/jquery-1.8.2.min.js"></script>
    <script src="../assets/Scripts/artDialog/dialog.min.js"></script>
    <link href="../assets/dskin/dui.css" rel="stylesheet"/>
    <script src="../assets/dskin/js/DUI.js"></script>
    <script src="../assets/Scripts/tcy365.js"></script>
    <link href="../assets/CSS/common.css" rel="stylesheet"/>
    <link href="../assets/CSS/paging.css" rel="stylesheet"/>
</head>
<body>
<form method="get" action="/WebSite/WebSiteList">
    <div class="p10">
        <div class="d-panel">
            <h3 class="arrow"><strong>查找分站</strong>
                <p class="d-panel-btns noclose"><a class="d-button d-button-white" id="addNews" href="#"
                                                   onclick="frame('新增分站','EditWebSite.jsp',900,600)"><i
                        class="icon icon-plus"></i>新建分站</a></p>
            </h3>
            <div class="content nopadding">

                <div class="d-seach">
                    <div class="d-seach-rank clearfix">
                        <div class="col-xs-4">
                            <label>分站名称：</label>
                            <input type="text" name="webname" class="d-form-input"/>
                        </div>
                        <div class="col-xs-4">
                            <label>分站ID：</label>
                            <input type="text" name="id" class="d-form-input"
                                   onkeyup="value=value.replace(/[^\d]/g,'')"/>
                        </div>
                        <div class="col-xs-4">
                            <label>可见状态：</label>
                            <select name="isvisible" class="d-form-input">
                                <option selected value="">请选择</option>
                                <c:forEach items='<%= IsVisible.values()%>' var="a" varStatus="idx">
                                    <option value="${a.getCode()}">${a.getDescription()}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="d-seach-rank clearfix">
                        <div class="col-xs-4">
                            <label>分站级别：</label>
                            <select name="webgrade" class="d-form-input">
                                <option selected value="">请选择</option>
                                <option value="1">地市级</option>
                                <option value="2">县区级</option>
                            </select>

                        </div>
                        <div class="col-xs-8">
                            <label>对应地区：</label>
                            <select name="ddlProvince" class="d-form-input">
                                <option selected value="">请选择</option>
                            </select>
                            <select name="ddlCity" class="d-form-input">
                                <option selected value="">请选择</option>
                            </select>
                            <select name="ddlCounty" class="d-form-input">
                                <option selected value="">请选择</option>
                            </select>
                        </div>
                    </div>
                    <div class="d-seach-rank clearfix">
                        <div class="col-xs-4">
                            <label>渠道ID：</label>
                            <input type="text" name="channelid" class="d-form-input"
                                   onkeyup="value=value.replace(/[^\d]/g,'')"/>
                        </div>
                    </div>
                    <div class="d-seach-sub">
                        <input type="submit" value="查 找" class="d-button d-button-blue d-button-large">

                    </div>
                </div>
            </div>
        </div>
        <div class="d-panel mt10">
            <h3><strong>分站列表</strong>
                <p class="d-panel-btns noclose"><a class="d-button d-button-white" onclick="location=location"
                                                   href="javascript:;"><i class="icon icon-repeat"></i>刷新</a></p>
            </h3>
            <div class="content nopadding">
                <table class="d-grid d-gridtable">
                    <thead>
                    <tr>
                        <th class="w-1">分站ID</th>
                        <th>分站名称</th>
                        <th>分站地址</th>
                        <th>可见状态</th>
                        <th>分站级别</th>
                        <th>对应地区</th>
                        <th>渠道ID</th>
                        <th>&nbsp</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${pageInfo.list}" var="b" varStatus="idx">
                        <tr>
                            <td>
                                <span title="${b.id}"><nobr>${b.id}</nobr></span>
                            </td>
                            <td>
                                <span title="${b.webname}"><nobr>${b.webname}</nobr></span>
                            </td>
                            <td>
                                <span title="${b.weburl}"><nobr>${b.weburl}</nobr></span>
                            </td>
                            <td>
                                <span title="${b.isvisible}"><nobr>${b.isvisible}</nobr></span>
                            </td>
                            <td>
                                <span title="${b.webgrade}"><nobr>${b.webgrade}</nobr></span>
                            </td>
                            <td>
                                <span title="${b.webarea}"><nobr>${b.webarea}</nobr></span>
                            </td>
                            <td>
                                <span title="${b.channelid}"><nobr>${b.channelid}</nobr></span>
                            </td>
                            <td>
                                <a href="javascript:;" class="edit"
                                   onclick="frame('编辑分站  (分站:${b.webname},${b.weburl})', '/WebSite/EditWebSite?wid=${b.id}', 900, 500)">编辑</a>|
                                <a href="javascript:;" class="edit"
                                   onclick="frame('编辑分站资讯  (分站:${b.webname},${b.weburl})', '/News/WebNewsList?from=1&wid=${b.id}', 900, 500)">资讯管理</a>|
                                <a href="javascript:;" class="edit"
                                   onclick="frame('分站推荐管理  (分站:${b.webname},${b.weburl})', 'RecommendMgr?wid=${b.id}', 900, 500)">推荐管理</a>|
                                <a href="javascript:;" class="edit"
                                   onclick="frame('分站隐藏游戏  (分站:${b.webname},${b.weburl})', 'WebSpecialGame?SpecialGameType=1&wid=${b.id}', 900, 500)">隐藏游戏</a>|
                                <a href="javascript:;" class="edit"
                                   onclick="frame('不可搜索游戏  (分站:${b.webname},${b.weburl})', 'WebSpecialGame?SpecialGameType=3&wid=${b.id}', 900, 500)">不可搜索游戏</a>|
                                <a href="javascript:;" class="edit"
                                   onclick="frame('大厅管理  (分站:${b.webname},${b.weburl})', 'HallDownList?wid=${b.id}', 900, 500)">大厅管理</a>
                            </td>
                            <td>
                                <input type="button" value="显示${b.id}">
                                <input type="button" value="隐藏${b.id}">
                            </td>
                        </tr>
                    </c:forEach>


                    </tbody>
                </table>
            </div>
        </div>
        <div>
            <%@ include file="Layout/paging.jsp" %>
        </div>
    </div>
</form>
<script src="http://static.tcy365.com/common/ui/jdpicker/1.0/jdpicker.min.js"></script>
<script src="http://static.tcy365.com/common/ui/dialog/1.0/dialog.js"></script>


</body>
</html>

