<#--<div class="pageContent">-->
  <div id="jbsxBox2" style="float:left; display:block; overflow:auto; width:714px;">
    <div class="pageHeader" style="border:1px #B8D0D6 solid">
      <form onsubmit="return queryPatient(this, 'jbsxBox2');" action="billing/patient_list"
            method="post">
        <input type="hidden" name="pageNum" value="${((page.pageIndex)!0)}"/>
        <input type="hidden" name="numPerPage" value="${(page.pageSize)!}"/>
        <div class="searchBar">
          <table class="searchContent">
            <tr>
              <td>
                <input name="keyword" class="digits" type="text" size="30" alt="请输入患者姓名或ID号"
                       value="${keyword!}"/>
              </td>
              <td>
                <div class="buttonActive">
                  <div class="buttonContent">
                    <button type="submit">检 索</button>
                  </div>
                </div>
              </td>
<#--              <td>-->
<#--                <a class="button" href="billing/adv_search" target="dialog" mask="true" title="查询框"><span>高级检索</span></a>-->
<#--              </td>-->
            </tr>
          </table>
          <div class="subBar">
            <ul>
              <li>
                <div class="buttonActive">
<#--                  <div class="buttonContent">-->
                    <a href="billing/adv_search" target="dialog" mask="true" title="查询框"><span>高级检索</span></a>
<#--                  </div>-->
                </div>
              </li>
            </ul>
          </div>
        </div>
      </form>
    </div>
    <div class="pageContent" style="border-right:1px #B8D0D6 solid; border-top:1px #B8D0D6 solid;">
      <table id="patientTable" class="table" width="99%" layoutH="148" rel="jbsxBox2">
        <thead>
        <tr>
          <th orderField="id">ID</th>
          <th>姓名</th>
          <th>患者ID</th>
          <th>医师</th>
          <th>登记日期</th>
          <th>电话</th>
        </tr>
        </thead>
        <tbody>
        <#list list as patient>
          <tr target="sid" rel="${patient.id}"
              onclick="showPatientBilling('${patient.patient_id!}');">
            <td>${patient.id!}</td>
            <td>${patient.patient_name!}</td>
            <td>${patient.patient_id!}</td>
            <td>${patient.physician!}</td>
            <td>${patient.created_at!?string("yyyy-MM-dd")}</td>
            <td>${patient.telephone!}</td>
          </tr>
        </#list>
        </tbody>
      </table>
        <#include "../include_page/page.ftl"/>
    </div>
  </div>

  <div id="jbsxBox3">
    <div class="unitBox" style="margin-left:720px;border:1px #B8D0D6 solid">
      <div class="pageHeader">
        <form class="required-validate" onsubmit="return saveItemCallback(this)" action="billing/saveItem?patientId=" method="post">
          <div class="searchBar">
            <table class="searchContent">
              <tr>
                <td>
                  收费项目：
                  <select
                      style="margin-right:3px; font-size: 12px; width: 212px; padding: 2px 2px 2px 2px"
                      name="billingCode" value="${(model.billingCode)!}">
                      <#list billingItemList as item>
                          <#if model?? && model.itemCode?? && item.code == model.itemCode>
                            <option value="${item.code!}" selected>${item.code!} ${item.name!}</option>
                          <#else>
                            <option value="${item.code!}">${item.code!} ${item.name!}</option>
                          </#if>
                      </#list>
                  </select>
                </td>
                <td>
                  数量：
                  <input name="amount" type="text" class="digits" size="15" value="${(model.amount)!}"/>
                </td>
              </tr>
            </table>
            <div class="subBar">
              <ul>
                <li>
                    <@shiro.hasPermission name="billing:add">
                      <div class="buttonActive">
                        <div class="buttonContent">
                          <button id="submitBtn" type="submit" disabled>保 存</button>
                        </div>
                      </div>
                    </@shiro.hasPermission>
                </li>
              </ul>
            </div>
          </div>
        </form>
      </div>
    </div>


    <form id="billingItemForm"
          action="billing/patient_billing_items_no_head?patientId=" method="post">
<#--      <input type="hidden" name="pageNum" value="${((page.pageIndex)!0)}"/>-->
<#--      <input type="hidden" name="numPerPage" value="${(page.pageSize)!}"/>-->
    </form>

    <div id="billingItemDiv" class="pageContent"
         style="margin-left:720px; border-left: 1px #B8D0D6 solid; border-right: 1px #B8D0D6 solid;">
<#--      <div class="panelBar">-->
<#--        <ul class="toolBar">-->
<#--            <@shiro.hasPermission name="patient:del">-->
<#--              <li><a class="delete" onclick="deleteItem({billing_sid});" title="确定要删除吗?"><span>删除</span></a></li>-->
<#--            </@shiro.hasPermission>-->
<#--          <li class="line">line</li>-->
<#--        </ul>-->
<#--      </div>-->
      <table class="table" width="99%" layoutH="138">
        <thead>
        <tr>
          <th>项目编码</th>
          <th>项目名称</th>
          <th>数量</th>
          <th>计价单位</th>
          <th>项目价格(元)</th>
          <th>操作</th>
        </tr>
        </thead>
        <tbody>
        </tbody>
      </table>
      <div class="panelBar">
        <div style="float: right; margin-top: 5px; margin-right: 5px;">
          <span style="margin: 1px 0 0 1px;">项目总收费，共 </span>
          <span style="font-weight:bold; color: red;">${totalBilling!}</span>
          <span> 元</span>
        </div>
      </div>
    </div>
  </div>
<#--</div>-->
