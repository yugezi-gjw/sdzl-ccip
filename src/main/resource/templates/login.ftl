<!DOCTYPE>
 
<html>
<head>
 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>患者随访管理</title>
<link href="${ctx.contextPath}/dwz/themes/css/login.css" rel="stylesheet" type="text/css" />
</head>
<script type="text/javascript">    
      
    function change(obj){
     obj.src= '${ctx.contextPath}/login/defaultKaptcha?' + Math.floor(Math.random()*100);
    }  
</script>  
<body>
	<div id="login">
		<div id="login_header">
			<div>
				<label style="font-size: 40px; font-family: 华文隶书; margin: 10px;">患者随访管理</label>
			</div>
<#--			<div class="login_headerContent">-->
<#--				<div class="navList">-->
<#--				 -->
<#--				</div>-->
<#--		 -->
<#--			</div>-->
		</div>
		<div id="login_content">
			<div class="loginForm">
				<form action="${ctx.contextPath}/loginDo">
					<p>
						<label>用户名：</label>
						<input type="text" name="username" size="20" value="admin" class="login_input" />
					</p>
					<p>
						<label>密码：</label>
						<input type="password" name="password" size="20" value="123456" class="login_input" />
					</p>
<#--					<p>-->
<#--						<label>验证码：</label>-->
<#--						<input class="code" name="verifyCode"  type="text" size="5" />-->
<#--						<span><img src="${ctx.contextPath}/login/defaultKaptcha" style="cursor:hand"   onClick="change(this);" alt="" width="75" height="24" /></span>-->
<#--					</p>-->
					<div class="login_bar">
						<input class="sub" type="submit" value=" " />
					</div>
				</form>
				<div>
			 
				</div>
				<div style="color:red"><br/>
				 ${(RequestParameters.errormsg)!""}
				</div>
			</div>
			<div class="login_banner">
			<img src="${ctx.contextPath}/dwz/themes/default/images/login-bg.png" />
			 
			</div>
			<div class="login_main">
			 
				<div class="login_inner">
			 
 
			 
				</div>
			</div>
		</div>
		<div id="login_footer">
			Copyright &copy;   All Rights Reserved.
		</div>
	</div>
</body>
</html>