<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/4
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>主站资讯列表</title>
    <script src="/assets/Scripts/jquery/jquery-1.8.2.min.js"></script>
    <script src="/assets/Scripts/artDialog/dialog.min.js"></script>
    <link href="/assets/dskin/dui.css" rel="stylesheet"/>
    <link href="/assets/CSS/common.css" rel="stylesheet"/>
    <script src="/assets/dskin/js/DUI.js"></script>
    <script src="/assets/jdpicker/1.0/jdpicker.min.js"></script>
    <script src="/assets/Scripts/tcy365.js"></script>
    <script src="/assets/Scripts/auto/jquery.autocomplete.js"></script>
</head>
<body>
<form id="form1" runat="server">
    <div class="p10">
        <div class="d-panel">
            <h3 class="arrow"><strong>
                <asp:Literal ID="ltSearchWebInfo" Text="查找资讯" runat="server"></asp:Literal></strong>
                <p class="d-panel-btns noclose">
                    <a class="d-button d-button-white" id="addNews" href="#"
                       onclick="frame('新建资讯', '/News/WebNewsEdit.aspx?wid=<% =ViewState["tblWebId"] %>', 900, 500)">新建资讯</a>
                </p>
            </h3>
            <div class="content nopadding">
                <div class="d-seach">
                    <div class="d-seach-rank">
                        <label>资讯标题：</label>
                        <asp:TextBox ID="txtTitle" runat="server" class="d-form-input w-10"></asp:TextBox>
                        &nbsp;&nbsp;&nbsp;&nbsp; 置顶：<asp:CheckBox ID="ckbIsAllTop" runat="server"/>
                    </div>
                    <div class="d-seach-rank clearfix">
                        <div class="col-xs-4">
                            <label>资　讯ID：</label>
                            <asp:TextBox ID="txtNewsID" runat="server" class="d-form-input"
                                         onkeyup="value=value.replace(/[^\d]/g,'')"></asp:TextBox>
                        </div>
                        <div class="col-xs-4">
                            <label>资讯类型：</label>
                            <asp:DropDownList ID="ddlNewsClass" runat="server" class="d-form-select"></asp:DropDownList>
                        </div>
                        <div class="col-xs-4">
                            <label>相关游戏：</label>
                            <asp:TextBox ID="txtAssociateGameCode" runat="server" class="d-form-input"></asp:TextBox>
                        </div>
                    </div>
                    <div class="d-seach-rank clearfix">
                        <div class="col-xs-8">
                            <label>有效时间：</label>
                            <asp:TextBox ID="txtValidBeginTime" runat="server" class="d-form-input"></asp:TextBox>至
                            <asp:TextBox ID="txtValidEndTime" runat="server" class="d-form-input"></asp:TextBox>
                        </div>
                        <div class="col-xs-4">
                            <label>可见状态：</label>
                            <asp:DropDownList ID="ddlIsVisible" runat="server" class="d-form-select">
                                <asp:ListItem Selected="True" Value="" Text="请选择"></asp:ListItem>
                                <asp:ListItem Value="1" Text="显示"></asp:ListItem>
                                <asp:ListItem Value="-1" Text="隐藏"></asp:ListItem>
                            </asp:DropDownList>
                        </div>

                    </div>
                    <div class="d-seach-rank clearfix">
                        <div class="col-xs-4">
                            <label>站点Id：</label>
                            <asp:TextBox ID="txttblWebId" runat="server" class="d-form-input"
                                         onkeyup="value=value.replace(/[^\d]/g,'')"></asp:TextBox>
                        </div>
                        <div class="col-xs-4">
                            <label>发布站点Id:</label>
                            <asp:TextBox ID="txtLauchWebId" runat="server" class="d-form-input"
                                         onkeyup="value=value.replace(/[^\d]/g,'')"></asp:TextBox>

                        </div>
                        <div class="col-xs-4">
                            <label>移动资讯:</label>
                            <asp:CheckBox ID="ckbIsMobileNews" runat="server" Text=""/>

                        </div>
                    </div>
                    <div class="d-seach-sub">
                        <asp:Button ID="btnSearch" runat="server" Text="查 找"
                                    class="d-button d-button-blue d-button-large" OnClick="btnSearch_Click"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="d-panel mt10">
            <h3><strong>资讯列表</strong>
                <p class="d-panel-btns noclose"><a class="d-button d-button-white" href="javascript:"
                                                   onclick="location=location"><i class="icon icon-repeat"></i>刷新</a>
                </p>
            </h3>
            <div class="content nopadding">
                <table class="d-grid d-gridtable">
                    <thead>
                    <tr>
                        <th class="w-1">资讯ID</th>
                        <th>资讯标题</th>
                        <th>资讯类型</th>
                        <th>相关游戏</th>
                        <th>有效时间</th>
                        <th>可见状态</th>
                        <th>移动端显示</th>
                        <th>创建人</th>
                        <th>发布时间</th>
                        <th>修改时间</th>
                        <th class="w-1"></th>
                        <th class="w-1"></th>
                    </tr>
                    </thead>
                    <tbody>
                    <asp:Repeater ID="rptNewsList" runat="server" OnItemDataBound="rptNewsList_ItemDataBound"
                                  OnItemCommand="rptNewsList_ItemCommand">
                        <ItemTemplate>
                            <tr>
                                <td>
                                    <asp:Literal ID="ltNewsID" runat="server"></asp:Literal>
                                </td>
                                <td>
                                    <asp:Literal ID="ltNewsTitle" runat="server"></asp:Literal>
                                </td>
                                <td>
                                    <asp:Literal ID="ltNewsClass" runat="server"></asp:Literal>
                                </td>
                                <td>
                                    <asp:Literal ID="ltAssociateGame" runat="server"></asp:Literal>
                                </td>
                                <td>
                                    <asp:Literal ID="ltValidData" runat="server"></asp:Literal></td>
                                <td>
                                    <asp:Literal ID="ltIsVisible" runat="server"></asp:Literal>
                                </td>
                                <td>
                                    <asp:Literal ID="ltIsMobileNews" runat="server"></asp:Literal>
                                </td>
                                <td>
                                    <asp:Literal ID="ltCreator" runat="server"></asp:Literal>
                                </td>
                                <td>
                                    <asp:Literal ID="ltAddTime" runat="server"></asp:Literal></td>
                                <td>
                                    <asp:Literal ID="ltLastUpdTime" runat="server"></asp:Literal></td>
                                <td><a href="javascript:;" class="edit"
                                       onclick="frame('编辑资讯', '/News/WebNewsEdit.aspx?nid=<%#Eval("Id") %>&wid=<% =ViewState["tblWebId"] %>', 900, 500)">编辑</a>
                                </td>
                                <td>
                                    <asp:LinkButton ID="lbtnShow" runat="server" Visible="false" class="show-type"
                                                    CommandArgument='<%#Eval("Id") %>'
                                                    CommandName="Show">显示</asp:LinkButton>
                                    <asp:LinkButton ID="lbtnHide" runat="server" Visible="false" class="show-type"
                                                    CommandArgument='<%#Eval("Id") %>'
                                                    CommandName="Hide">隐藏</asp:LinkButton></td>
                            </tr>
                        </ItemTemplate>
                    </asp:Repeater>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <script src="http://static.tcy365.com/common/ui/jdpicker/1.0/jdpicker.min.js"></script>
    <script src="http://static.tcy365.com/common/ui/combobox/1.0/combobox.min.js"></script>
    <script src="http://static.tcy365.com/common/ui/dialog/1.0/dialog.js"></script>
    <div>
        <cc:AspNetPager ID="ctrAspNetPager" runat="server" LinkType="服务器提交" PageSize="10" ShowPagerInfo="true"
                        ShowGoTo="true" OnPageIndexChange="ctrAspNetPager_PageIndexChange"/>
    </div>
    <script>

        var time1 = $('#txtValidBeginTime').jdPicker({
            date_format: "YYYY-mm-dd",
            timeShow: 0,
            timeBtn: 1
        });
        var time1 = $('#txtValidEndTime').jdPicker({
            date_format: "YYYY-mm-dd",
            timeShow: 0,
            timeBtn: 1
        });
    </script>
    <script>

        $("#txtAssociateGameCode").AutoComplete({
            'data': "/api/Game/GetAllTcyGame",
            'ajaxDataType': 'json',
            'listStyle': 'custom',
            'afterSelectedHandler': function (data) {
                $("#txtAssociateGameCode").val(data.GameShort);
            },
            'createItemHandler': function (index, data) {
                var div = $("<div></div>")
                div.html('<span class="red">' + data.GameName + '(' + data.GameShort + ' ' + data.GameArea + ')' + '</span>');
                return div;
            },
            'onerror': function (msg) {
                alert(msg);
            }
        });
    </script>
</form>
</body>
</html>
