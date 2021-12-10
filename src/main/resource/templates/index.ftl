<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <title>患者随访管理</title>

  <link href="${springMacroRequestContext.contextPath}/dwz/themes/default/style.css"
        rel="stylesheet" type="text/css" media="screen"/>
  <link href="${springMacroRequestContext.contextPath}/dwz/themes/css/core.css" rel="stylesheet"
        type="text/css" media="screen"/>
  <link href="${springMacroRequestContext.contextPath}/dwz/themes/css/print.css" rel="stylesheet"
        type="text/css" media="print"/>
  <!--[if IE]>
<link href="${springMacroRequestContext.contextPath}/dwz/themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>
<![endif]-->

  <!--[if lt IE 9]>
  <script src="dwz/js/speedup.js" type="text/javascript">
  </script>
  <script src="dwz/js/jquery-1.11.3.min.js" type="text/javascript"></script>
  <![endif]-->
  <!--[if gte IE 9]><!-->
  <script src="dwz/js/jquery-2.1.4.min.js" type="text/javascript"></script><!--<![endif]-->

  <script src="dwz/js/jquery.cookie.js" type="text/javascript"></script>
  <script src="dwz/js/jquery.validate.js" type="text/javascript"></script>
  <script src="dwz/js/jquery.bgiframe.js" type="text/javascript"></script>


  <script src="dwz/js/dwz.core.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.util.date.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.validate.method.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.barDrag.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.drag.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.tree.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.accordion.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.ui.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.theme.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.switchEnv.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.alertMsg.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.contextmenu.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.navTab.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.tab.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.resize.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.dialog.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.dialogDrag.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.sortDrag.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.cssTable.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.stable.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.taskBar.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.ajax.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.pagination.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.database.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.datepicker.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.effects.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.panel.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.checkbox.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.history.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.combox.js" type="text/javascript"></script>
  <script src="dwz/js/dwz.print.js" type="text/javascript"></script>

  <!-- 可以用dwz.min.js替换前面全部dwz.*.js (注意：替换时下面dwz.regional.zh.js还需要引入)
  <script src="bin/dwz.min.js" type="text/javascript"></script>
  -->
  <script src="dwz/js/dwz.regional.zh.js" type="text/javascript"></script>

<#--  <script src="business/js/billing.js" type="text/javascript"></script>-->
  <script src="business/js/bloodtested.js" type="text/javascript"></script>

  <script type="text/javascript">
      $(function () {
          DWZ.init("dwz/dwz.frag.xml", {
              //loginUrl:"login_dialog.html", loginTitle:"登录",	// 弹出登录对话框
              loginUrl: "${ctx.contextPath}/login",	// 跳到登录页面
              statusCode: {ok: 200, error: 300, timeout: 301}, //【可选】
              pageInfo: {
                  pageNum: "pageNum",
                  numPerPage: "numPerPage",
                  orderField: "orderField",
                  orderDirection: "orderDirection"
              }, //【可选】
              keys: {statusCode: "statusCode", message: "message"}, //【可选】
              ui: {hideMode: 'offsets'}, //【可选】hideMode:navTab组件切换的隐藏方式，支持的值有’display’，’offsets’负数偏移位置的值，默认值为’display’
              debug: true,	// 调试模式 【true|false】
              callback: function () {
                  initEnv();

                  $("#themeList").theme({themeBase: "${ctx.contextPath}/dwz/themes/"}); // themeBase 相对于index页面的主题base路径
              }
          });
      });
  </script>
</head>

<body>
<div id="layout">
  <div id="header">
    <div class="headerNav">
      <label style="font-size: 30px; font-family: 华文楷体;color: #ffffff;">患者随访管理</label>
      <ul class="nav">
        <li><a href="${ctx.contextPath}/sysuser/updPwdSelf?id=${(sysuser.id)!}" target="dialog"
               width="600">修改密码</a></li>
        <li><a href="${ctx.contextPath}/logout">退出</a></li>
      </ul>
    </div>

    <!-- navMenu -->

  </div>

  <div id="leftside">
    <div id="sidebar_s">
      <div class="collapse">
        <div class="toggleCollapse">
          <div></div>
        </div>
      </div>
    </div>
    <div id="sidebar">
      <div class="toggleCollapse"><h2>患者随访管理</h2>
        <div>收缩</div>
      </div>

      <div class="accordion" fillSpace="sidebar">
        <div class="accordionHeader">
          <h2><span>Folder</span>主菜单</h2>
        </div>
        <div class="accordionContent">
          <ul class="tree treeFolder">
              <#--							<@shiro.hasPermission name="base:list">-->
              <#--								<li><a href="demo/list" target="navTab" rel="demo">demo</a></li>-->
              <#--							</@shiro.hasPermission>-->
              <@shiro.hasPermission name="base:list">
                <li><a href="patient/list" target="navTab" rel="patient">患者信息管理</a></li>
              </@shiro.hasPermission>
<#--              <@shiro.hasRole name="admin">-->
<#--                <li>-->
<#--                  <a>系统管理</a>-->
<#--                  <ul>-->
<#--                      <@shiro.hasPermission name="sysuser:list">-->
<#--                        <li><a href="sysuser/list" target="navTab" rel="sysuser">后台用户</a></li>-->
<#--                      </@shiro.hasPermission>-->
<#--                      <@shiro.hasPermission name="sysPermission:list">-->
<#--                        <li><a href="sysPermission/list" target="navTab"-->
<#--                               rel="sysPermission">功能权限</a></li>-->
<#--                      </@shiro.hasPermission>-->
<#--                      <@shiro.hasPermission name="sysPermission:list">-->
<#--                        <li><a href="sysRole/list" target="navTab" rel="sysPermission">角色管理</a></li>-->
<#--                      </@shiro.hasPermission>-->
<#--                  </ul>-->
<#--                </li>-->
<#--              </@shiro.hasRole>-->
          </ul>

        </div>


      </div>
    </div>
  </div>
  <div id="container">
    <div id="navTab" class="tabsPage">
      <div class="tabsPageHeader">
        <div class="tabsPageHeaderContent"><!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
          <ul class="navTab-tab">
            <li tabid="main" class="main"><a href="javascript:;"><span><span
                      class="home_icon">我的主页</span></span></a></li>
          </ul>
        </div>
        <div class="tabsLeft">left</div><!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
        <div class="tabsRight">right</div><!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
        <div class="tabsMore">more</div>
      </div>
      <ul class="tabsMoreList">
        <li><a href="javascript:;">我的主页</a></li>
      </ul>
      <div class="navTab-panel tabsPageContent layoutBox">
        <div class="page unitBox">
          <div class="accountInfo">

            <p><span style="font-size: 30px; text-align: center; padding-top: 10px;">欢迎使用患者随访管理系统</span></p>

          </div>
          <div style="text-align: center; margin-top: 100px;" layoutH="80">
            <img src="${ctx.contextPath}/dwz/themes/default/images/Halcyon.png" />
          </div>
        </div>

      </div>
    </div>
  </div>

</div>

<div id="footer">Copyright</div>

</body>
</html>