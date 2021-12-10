<div class="unitBox" style="margin-left:720px;border:1px #B8D0D6 solid">
<#--  <div class="pageHeader">-->
<#--    <form onsubmit="return saveItemCallback(this)" action="billing/saveItem" method="post">-->
<#--      <input name="patientId" type="hidden" value="${(model.patientId)!}"/>-->
<#--      <input name="encounterId" type="hidden" value="${(model.encounterId)!}"/>-->

<#--      <div class="searchBar">-->
<#--        <table class="searchContent">-->
<#--          <tr>-->
<#--            <td>-->
<#--              收费项目：-->
<#--              <select-->
<#--                  style="margin-right:3px; font-size: 12px; width: 212px; padding: 2px 2px 2px 2px"-->
<#--                  name="billingCode" value="${(model.billingCode)!}">-->
<#--                  <#list billingItemList as item>-->
<#--                      <#if model?? && model.itemCode?? && item.code == model.itemCode>-->
<#--                        <option value="${item.code!}" selected>${item.name!}</option>-->
<#--                      <#else>-->
<#--                        <option value="${item.code!}">${item.name!}</option>-->
<#--                      </#if>-->
<#--                  </#list>-->
<#--              </select>-->
<#--            </td>-->
<#--            <td>-->
<#--              数量：-->
<#--              <input name="amount" type="text" size="30" value="${(model.amount)!}"/>-->
<#--            </td>-->
<#--          </tr>-->
<#--        </table>-->
<#--        <div class="subBar">-->
<#--          <ul>-->
<#--            <li>-->
<#--              <div class="buttonActive">-->
<#--                <div class="buttonContent">-->
<#--                  <button type="submit">保 存</button>-->
<#--                </div>-->
<#--              </div>-->
<#--            </li>-->
<#--          </ul>-->
<#--        </div>-->
<#--      </div>-->
<#--    </form>-->
<#--  </div>-->

  <form id="billingItemForm"
        action="billing/patient_billing_items_no_head?patient_id=${model.patientId!}" method="post">
    <input type="hidden" name="pageNum" value="${((page.pageIndex)!0)}"/>
    <input type="hidden" name="numPerPage" value="${(page.pageSize)!}"/>
  </form>

  <div id="billingItemDiv" class="pageContent"
       style="border-left:1px #B8D0D6 solid;border-right:1px #B8D0D6 solid">
    <table class="table" width="99%" layoutH="138">
      <thead>
      <tr>
        <th>项目编码</th>
        <th>项目名称</th>
        <th>数量</th>
        <th>计价单位</th>
        <th>项目价格(元)</th>
      </tr>
      </thead>
      <tbody>
      <#list list as billing>
        <tr target="sid" rel="${billing.id}">
          <td>${billing.billingCode!}</td>
          <td>${billing.billingName!}</td>
          <td>${billing.amount!}</td>
          <td>${billing.unit!}</td>
          <td>${billing.unitPrice!}</td>
        </tr>
      </#list>
      </tbody>
    </table>
  </div>
</div>