<html>
<head>
	<meta charset="utf-8">
	<title>Freemarker入门小DEMO </title>
</head>
<body>
<#include "head.ftl">
<#--我只是一个注释，我不会有任何输出  -->
${name},你好。${message}<br/>

<#assign linkman="Leaf">
联系人：${linkman}<br/>

<#if success=true>
  你已通过实名认证
<#else>  
  你未通过实名认证
</#if>


----商品价格表----<br>
<#list goodsList as goods>
  ${goods_index+1} 商品名称： ${goods.name} 价格：${goods.price}<br>
</#list>

一共  ${goodsList?size}  条记录-<br>

 <#assign text="{'bank':'工商银行','account':'10101920201920212'}" />
	<#assign data=text?eval />
	开户行：${data.bank}  账号：${data.account}
<br/>
当前日期：${today?date} <br>
当前时间：${today?time} <br>   
当前日期+时间：${today?datetime} <br>        
日期格式化：  ${today?string("yyyy年MM月")}<br>

累计积分：${point}<br>


<#if aaa??>
  aaa变量存在
<#else>
  aaa变量不存在
</#if>
<br>

 ${bbb!'bbb没有被复制'}
 <br>
 <#if point gt 100>
 会员
 </#if>




</body>
</html>
