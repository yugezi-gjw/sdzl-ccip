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
<#--          <div class="subBar">-->
<#--            <ul>-->
<#--              <li>-->
<#--                <div class="buttonActive">-->
<#--&lt;#&ndash;                  <div class="buttonContent">&ndash;&gt;-->
<#--                    <a href="billing/adv_search" target="dialog" mask="true" title="查询框"><span>高级检索</span></a>-->
<#--&lt;#&ndash;                  </div>&ndash;&gt;-->
<#--                </div>-->
<#--              </li>-->
<#--            </ul>-->
<#--          </div>-->
        </div>
      </form>
    </div>
    <div class="pageContent" style="border-right:1px #B8D0D6 solid; border-top:1px #B8D0D6 solid;">
      <table id="patientTable" class="table" width="99%" layoutH="148" rel="jbsxBox2">
        <thead>
        <tr>
          <th width="50" orderField="id">ID</th>
          <th width="80">姓名</th>
          <th width="80">住院号</th>
          <th width="80">性别</th>
          <th width="80">年龄</th>
          <th width="80">吸烟史</th>
          <th width="180">分期</th>
          <th width="80">EGFR基因突变</th>
          <th width="80">准确诊断日期</th>
          <th width="80">准确死亡日期</th>
          <th width="80">最近一次住院</th>
          <th width="80">准确OS</th>
          <th width="80">生存状态</th>
          <th width="80">进展时间</th>
          <th width="80">放疗次数</th>
          <th width="80">靶向先为1，放疗先为2，同步为0</th>
          <th width="80">是否同步</th>
          <th width="80">放疗转移部位数量</th>
          <th width="80">是否为多部位放疗</th>
          <th width="80">有无肺部放疗</th>
          <th width="180">肺转移放疗</th>
          <th width="80">有无脑转移</th>
          <th width="80">有无脑放疗</th>
          <th width="180">脑转移放疗</th>
          <th width="80">有无骨转移</th>
          <th width="80">有无骨放疗</th>
          <th width="80">骨转移放疗</th>
          <th width="80">肾上腺转移放疗</th>
          <th width="80">其他转移放疗</th>
          <th width="80">胸部放疗与诊断时间时序</th>
          <th width="80">胸部放疗与系统治疗时序</th>
          <th width="80">放射性副反应</th>
          <th width="80">TKI是否为一线用药</th>
          <th width="80">Platinum doublet</th>
          <th width="80">是否用吉非替尼</th>
          <th width="80">是否用厄洛替尼</th>
          <th width="80">是否用埃克替尼</th>
          <th width="80">全身治疗方案1</th>
          <th width="80">全身治疗方案2</th>
          <th width="80">全身治疗方案3</th>
          <th width="80">全身治疗方案4</th>
          <th width="80">全身治疗方案5</th>
          <th width="80">全身治疗方案6</th>
          <th width="80">全身治疗方案7</th>
          <th width="80">身份证号</th>
          <th width="80">手机号1</th>
          <th width="80">手机号2</th>
          <th></th>
        </tr>
        </thead>
        <tbody>
        <#list list as patient>
          <tr target="sid" rel="${patient.id}"
              onclick="showPatientBilling('${patient.patient_id!}');">
            <td>${patient.id!}</td>
            <td>${patient.patientName!}</td>
            <td>${patient.inpatientId!}</td>
            <td>${patient.gender!}</td>
            <td>${patient.age!}</td>
            <td>${patient.smoker!}</td>
            <td>${patient.stage!}</td>
            <td>${patient.EGFR!}</td>
            <td>${patient.diagnosisDt!}</td>
            <td>${patient.deathDt!}</td>
            <td>${patient.lastInpatientDt!}</td>
            <td>${patient.accurateOs!}</td>
            <td>${patient.alive!}</td>
            <td>${patient.progressDt!}</td>
            <td>${patient.deliveredFraction!}</td>
            <td>${patient.treatType!}</td>
            <td>${patient.synchronous!}</td>
            <td>${patient.metastasisSites!}</td>
            <td>${patient.isMultiSites!}</td>
            <td>${patient.isPulmonaryRadiation!}</td>
            <td>${patient.pulmonaryMetastasisRadiation!}</td>
            <td>${patient.isBrainMetastases!}</td>
            <td>${patient.isBrainRadiation!}</td>
            <td>${patient.brainMetastasisRadiation!}</td>
            <td>${patient.isBoneMetastases!}</td>
            <td>${patient.isBoneRadiation!}</td>
            <td>${patient.boneMetastasisRadiation!}</td>
            <td>${patient.adrenalMetastasisRadiation!}</td>
            <td>${patient.otherMetastasisRadiation!}</td>
            <td>${patient.cmdTimeSeq!}</td>
            <td>${patient.cmsTimeSeq!}</td>
            <td>${patient.sideReaction!}</td>
            <td>${patient.TKI!}</td>
            <td>${patient.platinumDoublet!}</td>
            <td>${patient.gefitinib!}</td>
            <td>${patient.angiostatin!}</td>
            <td>${patient.icotinib!}</td>
            <td>${patient.holisticTx1!}</td>
            <td>${patient.holisticTx2!}</td>
            <td>${patient.holisticTx3!}</td>
            <td>${patient.holisticTx4!}</td>
            <td>${patient.holisticTx5!}</td>
            <td>${patient.holisticTx6!}</td>
            <td>${patient.holisticTx7!}</td>
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
