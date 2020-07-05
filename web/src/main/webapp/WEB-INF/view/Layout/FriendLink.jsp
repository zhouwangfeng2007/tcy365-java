<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="friend-link">
    <div class="content">
        <c:if test="${listFriYqlj!=null}">
            <p>
                <span class="friend-link-title">友情链接&nbsp;&gt;</span>
                <c:forEach items="${listFriYqlj}" var="f">
                    <a href="${f.Url}" target="_blank" title="${f.Content}">${f.Content}</a>
                </c:forEach>
            </p>
        </c:if>
        <c:if test="${listFriRmcs!=null}">
            <p>
                <span class="friend-link-title">热门城市&nbsp;&gt;</span>
                <c:forEach items="${listFriRmcs}" var="f">
                    <a href="${f.Url}" target="_blank" title="${f.Content}">${f.Content}</a>
                </c:forEach>
            </p>
        </c:if>
        <c:if test="${listFriRmyx!=null}">
            <p>
                <span class="friend-link-title">热门游戏&nbsp;&gt;</span>
                <c:forEach items="${listFriRmcs}" var="f">
                    <a href="${f.Url}" target="_blank" title="${f.Content}">${f.Content} </a>
                </c:forEach>
            </p>
        </c:if>
    </div>

</div>
