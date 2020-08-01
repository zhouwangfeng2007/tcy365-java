<c:if test="${pageInfo.pages > 1}">
    <nav class="navigation pagination" role="navigation">
        <div class="nav-links">
            <c:choose>
                <c:when test="${pageInfo.pages <= 3 }">
                    <c:set var="begin" value="1"/>
                    <c:set var="end" value="${pageInfo.pages }"/>
                </c:when>
                <c:otherwise>
                    <c:set var="begin" value="${pageInfo.pageNum-1 }"/>
                    <c:set var="end" value="${pageInfo.pageNum + 2}"/>
                    <c:if test="${begin < 2 }">
                        <c:set var="begin" value="1"/>
                        <c:set var="end" value="3"/>
                    </c:if>
                    <c:if test="${end > pageInfo.pages }">
                        <c:set var="begin" value="${pageInfo.pages-2}"/>
                        <c:set var="end" value="${pageInfo.pages }"/>
                    </c:if>
                </c:otherwise>
            </c:choose>
            <c:choose>
                <c:when test="${pageInfo.pageNum eq 1 }">
                </c:when>
                <c:otherwise>
                    <a class="page-numbers" href="${pageUrlPrefix}=${pageInfo.pageNum-1}">
                        <span class="fa fa-angle-left">&lt;</span>
                    </a>
                </c:otherwise>
            </c:choose>
            <c:if test="${begin >= 2 }">
                <a class="page-numbers" href="${pageUrlPrefix}=1">1</a>
            </c:if>
            <c:if test="${begin  > 2 }">
                <span class="page-numbers dots">...</span>
            </c:if>
            <c:forEach begin="${begin }" end="${end }" var="i">
                <c:choose>
                    <c:when test="${i eq pageInfo.pageNum }">
                        <a class="page-numbers current">${i}</a>
                    </c:when>
                    <c:otherwise>
                        <a class="page-numbers" href="${pageUrlPrefix}=${i}">${i}</a>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
            <c:if test="${end < pageInfo.pages-1}">
                <span class="page-numbers dots">...</span>
            </c:if>
            <c:if test="${end < pageInfo.pages }">
                <a href="${pageUrlPrefix}=${pageInfo.pages}">${pageInfo.pages}</a>
            </c:if>
            <c:choose>
                <c:when test="${pageInfo.pageNum eq pageInfo.pages }">
                </c:when>
                <c:otherwise>
                    <a class="page-numbers" href="${pageUrlPrefix}=${pageInfo.pageNum+1}">
                        <span class="fa fa-angle-right">&gt;</span>
                    </a>
                </c:otherwise>
            </c:choose>
        </div>
    </nav>
</c:if>