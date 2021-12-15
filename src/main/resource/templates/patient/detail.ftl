<div class="pageContent">
  <div class="panel" defH="70">
    <h1>病人基本信息</h1>
    <div class="pageContent">
      <div class="pageFormContent">
        <p>
          <label>姓    名：</label>
          <label>${(patient.patientName)!}</label>
        </p>
        <p>
          <label>住 院 号：</label>
          <label>${(patient.inpatientId)!}</label>
        </p>
        <p>
          <label>性    别：</label>
          <label>
              <#if patient.gender == "1">
                  男
                  <#else>
                  女
              </#if>
          </label>
        </p>
        <p>
          <label>身 份 证：</label>
          <label>${(patient.nationalId)!}</label>
        </p>
      </div>
    </div>
  </div>
<#--  <div class="divider"></div>-->
  <div class="tabs">
    <div class="tabsHeader">
      <div class="tabsHeaderContent">
        <ul>
          <li><a href="javascript:;"><span>就诊信息</span></a></li>
          <li><a href="javascript:;"><span>化验结果</span></a></li>
        </ul>
      </div>
    </div>
    <div class="tabsContent">
      <div class="unitBox">
        <div class="pageContent">
            <#--            <div class="panelBar">-->
            <#--              <ul class="toolBar">-->
            <#--                  <@shiro.hasPermission name="patient:add">-->
            <#--                    <li><a class="add" href="encounter/add" target="dialog" rel="save"><span>添加</span></a></li>-->
            <#--                  </@shiro.hasPermission>-->
            <#--                  <@shiro.hasPermission name="patient:upd">-->
            <#--                    <li><a class="edit" href="encounter/upd?id={sid}" target="dialog"><span>修改</span></a></li>-->
            <#--                  </@shiro.hasPermission>-->
            <#--              </ul>-->
            <#--            </div>-->
          <div class="pageFormContent" layoutH="208">
            <dl>
              <dt>分期：</dt>
              <dd><label>${(encounter.stage)!}</label></dd>
            </dl>
            <dl>
              <dt>EGFR基因突变：</dt>
              <dd><label>${(encounter.egfr)!}</label></dd>
            </dl>
            <dl>
              <dt>准确诊断日期：</dt>
              <dd><label>${(encounter.diagnosisDt)!}</label></dd>
            </dl>
            <dl>
              <dt>准确死亡日期：</dt>
              <dd><label>${(encounter.deathDt)!}</label></dd>
            </dl>
            <dl>
              <dt>最近一次住院：</dt>
              <dd><label>${(encounter.lastInpatientDt)!}</label></dd>
            </dl>
            <dl>
              <dt>准确OS：</dt>
              <dd><label>${(encounter.accurateOs)!}</label></dd>
            </dl>
            <dl>
              <dt>生存状态：</dt>
              <dd><label>
                      <#if encounter.alive == "1">
                        死亡
                      <#elseif encounter.alive == "0">
                        生存
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>进展时间：</dt>
              <dd><label>${(encounter.progressDt)!}</label></dd>
            </dl>
            <dl>
              <dt>放疗次数：</dt>
              <dd><label>${(encounter.deliveredFraction)!}</label></dd>
            </dl>
            <dl>
              <dt>治疗类型：</dt>
              <dd><label>
                      <#if encounter.treatType == "1">
                        靶向先
                      <#elseif encounter.treatType == "0">
                        同步
                      <#elseif encounter.treatType == "2">
                        放疗先
                      </#if>
                      ${(encounter.treatType)!}
                </label></dd>
            </dl>
            <dl>
              <dt>是否同步：</dt>
              <dd><label>${(encounter.synchronous)!}</label></dd>
            </dl>
            <dl>
              <dt>放疗转移部位数量：</dt>
              <dd><label>${(encounter.metastasisSites)!}</label></dd>
            </dl>
            <dl>
              <dt>是否为多部位放疗：</dt>
              <dd><label>${(encounter.isMultiSites)!}</label></dd>
            </dl>
            <dl>
              <dt>有无肺部放疗：</dt>
              <dd><label>${(encounter.isPulmonaryRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>肺转移放疗：</dt>
              <dd><label>${(encounter.pulmonaryMetastasisRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>有无脑转移：</dt>
              <dd><label>${(encounter.isBrainMetastases)!}</label></dd>
            </dl>
            <dl>
              <dt>有无脑放疗：</dt>
              <dd><label>${(encounter.isBrainRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>脑转移放疗：</dt>
              <dd><label>${(encounter.brainMetastasisRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>有无骨转移：</dt>
              <dd><label>${(encounter.isBoneMetastases)!}</label></dd>
            </dl>
            <dl>
              <dt>有无骨放疗：</dt>
              <dd><label>${(encounter.isBoneRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>骨转移放疗：</dt>
              <dd><label>${(encounter.boneMetastasisRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>肾上腺转移放疗：</dt>
              <dd><label>${(encounter.adrenalMetastasisRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>其他转移放疗：</dt>
              <dd><label>${(encounter.otherMetastasisRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>胸放与诊断时间时序：</dt>
              <dd><label>${(encounter.cmdTimeSeq)!}</label></dd>
            </dl>
            <dl>
              <dt>胸放与系统治疗时序：</dt>
              <dd><label>${(encounter.cmsTimeSeq)!}</label></dd>
            </dl>
            <dl>
              <dt>放射性副反应：</dt>
              <dd><label>${(encounter.sideReaction)!}</label></dd>
            </dl>
            <dl>
              <dt>TKI是否为一线用药：</dt>
              <dd><label>${(encounter.tki)!}</label></dd>
            </dl>
            <dl>
              <dt>Platinum doublet：</dt>
              <dd><label>${(encounter.platinumDoublet)!}</label></dd>
            </dl>
            <dl>
              <dt>是否用吉非替尼：</dt>
              <dd><label>${(encounter.gefitinib)!}</label></dd>
            </dl>
            <dl>
              <dt>是否用厄洛替尼：</dt>
              <dd><label>${(encounter.angiostatin)!}</label></dd>
            </dl>
            <dl>
              <dt>是否用埃克替尼：</dt>
              <dd><label>${(encounter.icotinib)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案1：</dt>
              <dd><label>${(encounter.holisticTx1)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案2：</dt>
              <dd><label>${(encounter.holisticTx2)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案3：</dt>
              <dd><label>${(encounter.holisticTx3)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案4：</dt>
              <dd><label>${(encounter.holisticTx4)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案5：</dt>
              <dd><label>${(encounter.holisticTx5)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案6：</dt>
              <dd><label>${(encounter.holisticTx6)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案7：</dt>
              <dd><label>${(encounter.holisticTx7)!}</label></dd>
            </dl>
          </div>
        </div>
      </div>


      <div>
        <form class="required-validate" onsubmit="return saveItemCallback(this)" action="bloodtested/save?patientId=" method="post">
          <div class="pageFormContent">
            <p>
              <label>检测时间：</label>
              <input name="testedName" type="text" value="${(model.testedName)!}"/>
            </p>
            <p>
              <label>白 细 胞：</label>
              <input name="whiteCells" type="text" value="${(model.whiteCells)!}"/>
            </p>
            <p>
              <label>中性粒细胞：</label>
              <input name="neutrophilLeucocyte" type="text" value="${(model.neutrophilLeucocyte)!}"/>
            </p>
            <p>
              <label>淋巴细胞：</label>
              <input name="lymphocyte" type="text" value="${(model.lymphocyte)!}"/>
            </p>
            <p>
              <label>单核细胞：</label>
              <input name="monocyte" type="text" value="${(model.monocyte)!}"/>
            </p>
            <p>
              <label>血 小 板：</label>
              <input name="thrombocyte" type="text" value="${(model.thrombocyte)!}"/>
            </p>
            <p>
              <label>SII：</label>
              <input name="sii" type="text" value="${(model.sii)!}"/>
            </p>
            <p>
              <label>NLR：</label>
              <input name="nlr" type="text" value="${(model.nlr)!}"/>
            </p>
            <p>
              <label>PLR：</label>
              <input name="plr" type="text" value="${(model.plr)!}"/>
            </p>
            <p>
              <label>LMR：</label>
              <input name="lmr" type="text" value="${(model.lmr)!}"/>
            </p>
          </div>
        <div class="pageHeader">
            <div class="searchBar">
              <div class="subBar">
                <ul>
                  <li>
<#--                      <@shiro.hasPermission name="billing:add">-->
                        <div class="buttonActive">
                          <div class="buttonContent">
                            <button id="submitBtn" type="submit">保 存</button>
                          </div>
                        </div>
<#--                      </@shiro.hasPermission>-->
                  </li>
                </ul>
              </div>
            </div>
        </div>
        </form>

        <form id="bloodTestedForm"
              action="bloodtested/list?patientId=" method="post">
            <#--      <input type="hidden" name="pageNum" value="${((page.pageIndex)!0)}"/>-->
            <#--      <input type="hidden" name="numPerPage" value="${(page.pageSize)!}"/>-->
        </form>

<#--        <div class="panelBar">-->
<#--          <ul class="toolBar">-->
<#--              <@shiro.hasPermission name="patient:add">-->
<#--                <li><a class="add" href="bloodtested/add?encounterId=${(encounter.id)!}" target="dialog" rel="save"><span>添加</span></a></li>-->
<#--              </@shiro.hasPermission>-->
<#--              <@shiro.hasPermission name="patient:del">-->
<#--                <li><a class="delete" href="bloodtested/del?id={sid}" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>-->
<#--              </@shiro.hasPermission>-->
<#--          </ul>-->
<#--        </div>-->
        <div id="bloodTestedDiv" class="pageContent">
          <table class="table" width="100%" layoutH="158" addButton="新建">
          <thead>
          <tr>
<#--              <th orderField="id"  >ID</th>-->
            <th>检测时间</th>
            <th>白细胞</th>
            <th>中性粒细胞</th>
            <th>淋巴细胞</th>
            <th>单核细胞</th>
            <th>血小板</th>
            <th>SII</th>
            <th>NLR</th>
            <th>PLR</th>
            <th>LMR</th>
            <th>操作</th>
          </tr>
          </thead>
          <tbody>
          <#list list as bloodTested>
<#--                        <td>${bloodTested.id!}</td>-->
                        <td>${bloodTested.testedName!}</td>
                        <td>${bloodTested.whiteCells!}</td>
                        <td>${bloodTested.neutrophilLeucocyte!}</td>
                        <td>${bloodTested.lymphocyte!}</td>
                        <td>${bloodTested.monocyte!}</td>
                        <td>${bloodTested.thrombocyte!}</td>
                        <td>${bloodTested.sii!}</td>
                        <td>${bloodTested.nlr!}</td>
                        <td>${bloodTested.plr!}</td>
                        <td>${bloodTested.lmr!}</td>
                        <td>
                          <a class="delete" onclick="deleteItem('${bloodTested.id}');" title="确定要删除吗?"><span>删除</span></a>
                        </td>
            </tr>
          </#list>
          </tbody>
        </table>
        </div>
      </div>

    </div>
    <div class="tabsFooter">
      <div class="tabsFooterContent"></div>
    </div>
  </div>
</div>




