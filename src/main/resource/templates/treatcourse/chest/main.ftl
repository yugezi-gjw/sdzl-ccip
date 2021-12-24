<div class="pageContent">
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
                        <div class="panelBar">
                          <ul class="toolBar">
                            <li><a class="edit" href="chest/edit?treatCourseId=${(treatCourseChest.treatCourseId)!}" target="dialog" rel="save" width="850" height="750"><span>编辑</span></a></li>
                          </ul>
                        </div>

          <form id="chestForm"
                action="chest/view?treatCourseId=${(treatCourseChest.treatCourseId)!}" method="post">
          </form>

          <div id="chestDiv" class="pageFormContent" layoutH="208">
            <dl>
              <dt>分期：</dt>
              <dd><label>${(treatCourseChest.stage)!}</label></dd>
            </dl>
            <dl>
              <dt>EGFR基因突变：</dt>
              <dd><label>${(treatCourseChest.egfr)!}</label></dd>
            </dl>
            <dl>
              <dt>准确诊断日期：</dt>
              <dd><label>${(treatCourseChest.diagnosisDt)!}</label></dd>
            </dl>
            <dl>
              <dt>准确死亡日期：</dt>
              <dd><label>${(treatCourseChest.deathDt)!}</label></dd>
            </dl>
            <dl>
              <dt>最近一次住院：</dt>
              <dd><label>${(treatCourseChest.lastInpatientDt)!}</label></dd>
            </dl>
            <dl>
              <dt>准确OS：</dt>
              <dd><label>${(treatCourseChest.accurateOs)!}</label></dd>
            </dl>
            <dl>
              <dt>生存状态：</dt>
              <dd><label>
                      <#if (treatCourseChest.alive)??>
                        <#if treatCourseChest.alive == "1">
                          死亡
                        <#elseif treatCourseChest.alive == "0">
                          生存
                        </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>进展时间：</dt>
              <dd><label>${(treatCourseChest.progressDt)!}</label></dd>
            </dl>
            <dl>
              <dt>放疗次数：</dt>
              <dd><label>${(treatCourseChest.deliveredFraction)!}</label></dd>
            </dl>
            <dl>
              <dt>治疗类型：</dt>
              <dd><label>
                      <#if (treatCourseChest.treatType)?? && treatCourseChest.treatType == "1">
                        靶向先
                      <#elseif (treatCourseChest.treatType)?? && treatCourseChest.treatType == "0">
                        同步
                      <#elseif (treatCourseChest.treatType)?? && treatCourseChest.treatType == "2">
                        放疗先
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>是否同步：</dt>
              <dd><label>
                      <#if (treatCourseChest.synchronous)??>
                          <#if treatCourseChest.synchronous == "1">
                            是
                          <#elseif treatCourseChest.synchronous == "0">
                            否
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>放疗转移部位数量：</dt>
              <dd><label>${(treatCourseChest.metastasisSites)!}</label></dd>
            </dl>
            <dl>
              <dt>是否为多部位放疗：</dt>
              <dd><label>
                      <#if (treatCourseChest.isMultiSites)??>
                          <#if treatCourseChest.isMultiSites == "1">
                            是
                          <#elseif treatCourseChest.isMultiSites == "0">
                            否
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>有无肺部放疗：</dt>
              <dd><label>
                      <#if (treatCourseChest.isPulmonaryRadiation)??>
                          <#if treatCourseChest.isPulmonaryRadiation == "1">
                            有
                          <#elseif treatCourseChest.isPulmonaryRadiation == "0">
                            无
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>肺转移放疗：</dt>
              <dd>
                <label style="width: 250px;">${(treatCourseChest.pulmonaryMetastasisRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>有无脑转移：</dt>
              <dd><label>
                      <#if (treatCourseChest.isBrainMetastases)??>
                          <#if treatCourseChest.isBrainMetastases == "1">
                            有
                          <#elseif treatCourseChest.isBrainMetastases == "0">
                            无
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>有无脑放疗：</dt>
              <dd><label>
                      <#if (treatCourseChest.isBrainRadiation)??>
                          <#if treatCourseChest.isBrainRadiation == "1">
                            有
                          <#elseif treatCourseChest.isBrainRadiation == "0">
                            无
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>脑转移放疗：</dt>
              <dd><label style="width: 250px;">${(treatCourseChest.brainMetastasisRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>有无骨转移：</dt>
              <dd><label>
                      <#if (treatCourseChest.isBoneMetastases)??>
                          <#if treatCourseChest.isBoneMetastases == "1">
                            有
                          <#elseif treatCourseChest.isBoneMetastases == "0">
                            无
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>有无骨放疗：</dt>
              <dd><label>
                      <#if (treatCourseChest.isBoneRadiation)??>
                          <#if treatCourseChest.isBoneRadiation == "1">
                            有
                          <#elseif treatCourseChest.isBoneRadiation == "0">
                            无
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>骨转移放疗：</dt>
              <dd><label style="width: 250px;">${(treatCourseChest.boneMetastasisRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>肾上腺转移放疗：</dt>
              <dd><label style="width: 250px;">${(treatCourseChest.adrenalMetastasisRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>其他转移放疗：</dt>
              <dd><label style="width: 250px;">${(treatCourseChest.otherMetastasisRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>胸放与诊断时间时序：</dt>
              <dd><label>${(treatCourseChest.cmdTimeSeq)!}</label></dd>
            </dl>
            <dl>
              <dt>胸放与系统治疗时序：</dt>
              <dd><label>${(treatCourseChest.cmsTimeSeq)!}</label></dd>
            </dl>
            <dl>
              <dt>放射性副反应：</dt>
              <dd><label>${(treatCourseChest.sideReaction)!}</label></dd>
            </dl>
            <dl>
              <dt>TKI是否为一线用药：</dt>
              <dd><label>
                      <#if (treatCourseChest.tki)??>
                          <#if treatCourseChest.tki == "1">
                            是
                          <#elseif treatCourseChest.tki == "0">
                            否
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>Platinum doublet：</dt>
              <dd><label>
                      <#if (treatCourseChest.platinumDoublet)??>
                          <#if treatCourseChest.platinumDoublet == "1">
                            是
                          <#elseif treatCourseChest.platinumDoublet == "0">
                            否
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>是否用吉非替尼：</dt>
              <dd><label>
                      <#if (treatCourseChest.gefitinib)??>
                          <#if treatCourseChest.gefitinib == "1">
                            是
                          <#elseif treatCourseChest.gefitinib == "0">
                            否
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>是否用厄洛替尼：</dt>
              <dd><label>
                      <#if (treatCourseChest.angiostatin)??>
                          <#if treatCourseChest.angiostatin == "1">
                            是
                          <#elseif treatCourseChest.angiostatin == "0">
                            否
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>是否用埃克替尼：</dt>
              <dd><label>
                      <#if (treatCourseChest.icotinib)??>
                          <#if treatCourseChest.icotinib == "1">
                            是
                          <#elseif treatCourseChest.icotinib == "0">
                            否
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案1：</dt>
              <dd><label style="width: 250px;">${(treatCourseChest.holisticTx1)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案2：</dt>
              <dd><label style="width: 250px;">${(treatCourseChest.holisticTx2)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案3：</dt>
              <dd><label style="width: 250px;">${(treatCourseChest.holisticTx3)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案4：</dt>
              <dd><label style="width: 250px;">${(treatCourseChest.holisticTx4)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案5：</dt>
              <dd><label style="width: 250px;">${(treatCourseChest.holisticTx5)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案6：</dt>
              <dd><label style="width: 250px;">${(treatCourseChest.holisticTx6)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案7：</dt>
              <dd><label style="width: 250px;">${(treatCourseChest.holisticTx7)!}</label></dd>
            </dl>
          </div>
        </div>
      </div>


      <div>
        <form class="required-validate" onsubmit="return saveItemCallback(this)" action="bloodtested/save?treatCourseId=${(treatCourseChest.treatCourseId)!}" method="post">
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
              action="bloodtested/list?treatCourseId=${(treatCourseChest.treatCourseId)!}" method="post">
            <#--      <input type="hidden" name="pageNum" value="${((page.pageIndex)!0)}"/>-->
            <#--      <input type="hidden" name="numPerPage" value="${(page.pageSize)!}"/>-->
        </form>

<#--        <div class="panelBar">-->
<#--          <ul class="toolBar">-->
<#--              <@shiro.hasPermission name="patient:add">-->
<#--                <li><a class="add" href="bloodtested/add?treatCourseChestId=${(treatCourseChest.id)!}" target="dialog" rel="save"><span>添加</span></a></li>-->
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
          <#if list?? && (list?size > 0)>
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
          </#if>
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




