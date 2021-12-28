<div class="pageContent">
  <div class="panel" defH="70">
    <h1>病人基本信息</h1>
    <div class="pageContent">
      <div class="pageFormContent">
        <p>
          <label>姓    名：</label>
          <label style="font-weight: bold; font-size: x-large">${(patient.patientName)!}</label>
        </p>
        <p>
          <label>住 院 号：</label>
          <label style="font-weight: bold; font-size: x-large">${(patient.inpatientId)!}</label>
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
                            <li><a class="edit" href="galactophore/edit?treatCourseId=${(dto.treatCourseId)!}" target="dialog" rel="save" width="850" height="750"><span>编辑</span></a></li>
                          </ul>
                        </div>

          <form id="galactophoreForm"
                action="galactophore/view?treatCourseId=${(dto.treatCourseId)!}" method="post">
          </form>

          <div id="galactophoreDiv" class="pageFormContent" layoutH="208">
            <dl>
              <dt>初潮年龄：</dt>
              <dd><label>${(dto.menarcheAge)!}</label></dd>
            </dl>
            <dl>
              <dt>闭经年龄：</dt>
              <dd><label>${(dto.amenorrheaAge)!}</label></dd>
            </dl>
            <dl>
              <dt>分子分型：</dt>
              <dd><label>${(dto.molecularSubtyping)!}</label></dd>
            </dl>
            <dl>
              <dt>ER：</dt>
              <dd><label>${(dto.er)!}</label></dd>
            </dl>
            <dl>
              <dt>PR：</dt>
              <dd><label>${(dto.pr)!}</label></dd>
            </dl>
            <dl>
              <dt>Her-2：</dt>
              <dd><label>${(dto.her2)!}</label></dd>
            </dl>
            <dl>
              <dt>Ki-67：</dt>
              <dd><label>${(dto.ki67)!}</label></dd>
            </dl>
            <dl>
              <dt>分期：</dt>
              <dd><label>${(dto.stage)!}</label></dd>
            </dl>
            <dl>
              <dt>分期TNM：</dt>
              <dd><label>${(dto.stageTNM)!}</label></dd>
            </dl>
            <dl>
              <dt>手术方式：</dt>
              <dd><label>${(dto.surgeryMode)!}</label></dd>
            </dl>
            <dl>
              <dt>FISH扩增：</dt>
              <dd><label>${(dto.fishAugmentation)!}</label></dd>
            </dl>
            <dl>
              <dt>基因检测：</dt>
              <dd><label>${(dto.geneticTest)!}</label></dd>
            </dl>
            <dl>
              <dt>STEEP评分：</dt>
              <dd><label>${(dto.steepGrade)!}</label></dd>
            </dl>
            <dl>
              <dt>准确诊断日期：</dt>
              <dd><label>${(dto.diagnosisDt)!}</label></dd>
            </dl>
            <dl>
              <dt>准确死亡日期：</dt>
              <dd><label>${(dto.deathDt)!}</label></dd>
            </dl>
            <dl>
              <dt>最近一次住院：</dt>
              <dd><label>${(dto.lastInpatientDt)!}</label></dd>
            </dl>
            <dl>
              <dt>准确OS：</dt>
              <dd><label>${(dto.accurateOs)!}</label></dd>
            </dl>
            <dl>
              <dt>生存状态：</dt>
              <dd><label>
                      <#if (dto.alive)??>
                        <#if dto.alive == "1">
                          死亡
                        <#elseif dto.alive == "0">
                          生存
                        </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>首次进展时间：</dt>
              <dd><label>${(dto.progressDt)!}</label></dd>
            </dl>
            <dl>
              <dt>放疗次数：</dt>
              <dd><label>${(dto.deliveredFraction)!}</label></dd>
            </dl>
            <dl>
              <dt>放疗转移部位数量：</dt>
              <dd><label>${(dto.metastasisSites)!}</label></dd>
            </dl>
            <dl>
              <dt>是否为多部位放疗：</dt>
              <dd><label>
                      <#if (dto.isMultiSites)??>
                          <#if dto.isMultiSites == "1">
                            是
                          <#elseif dto.alive == "0">
                            否
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>有无胸壁/乳腺放疗：</dt>
              <dd><label>
                      <#if (dto.isGalactophoreRadiation)??>
                          <#if dto.isGalactophoreRadiation == "1">
                            有
                          <#elseif dto.isGalactophoreRadiation == "0">
                            无
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>胸壁放疗时间、范围及剂量：</dt>
              <dd><label style="width: 250px;">${(dto.galactophoreRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>有无脑转移：</dt>
              <dd><label>
                      <#if (dto.isBrainMetastases)??>
                          <#if dto.isBrainMetastases == "1">
                            有
                          <#elseif dto.isBrainMetastases == "0">
                            无
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>有无脑放疗：</dt>
              <dd><label>
                      <#if (dto.isBrainRadiation)??>
                          <#if dto.isBrainRadiation == "1">
                            有
                          <#elseif dto.isBrainRadiation == "0">
                            无
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>脑转移放疗：</dt>
              <dd><label style="width: 250px;">${(dto.brainMetastasisRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>有无骨转移：</dt>
              <dd><label>
                      <#if (dto.isBoneMetastases)??>
                          <#if dto.isBoneMetastases == "1">
                            有
                          <#elseif dto.isBoneMetastases == "0">
                            无
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>有无骨放疗：</dt>
              <dd><label>
                      <#if (dto.isBoneRadiation)??>
                          <#if dto.isBoneRadiation == "1">
                            有
                          <#elseif dto.isBoneRadiation == "0">
                            无
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>骨转移放疗：</dt>
              <dd><label style="width: 250px;">${(dto.boneMetastasisRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>有无肝转移：</dt>
              <dd><label>
                      <#if (dto.isHepaticMetastases)??>
                          <#if dto.isHepaticMetastases == "1">
                            有
                          <#elseif dto.isHepaticMetastases == "0">
                            无
                          </#if>
                      </#if>
                </label></dd>
            </dl>
            <dl>
              <dt>肾上腺转移放疗：</dt>
              <dd><label style="width: 250px;">${(dto.adrenalMetastasisRadiation)!}</label></dd>
            </dl>
            <dl>
              <dt>其他转移放疗：</dt>
              <dd><label style="width: 250px;">${(dto.otherMetastasisRadiation)!}</label></dd>
            </dl>
              <dl>
                <dt>是否用抗Her-2药物：</dt>
                <dd><label>
                        <#if (dto.her2Drug)??>
                            <#if dto.her2Drug == "1">
                              是
                            <#elseif dto.her2Drug == "0">
                              否
                            </#if>
                        </#if>
                  </label></dd>
              </dl>
              <dl>
                <dt>是否用内分泌：</dt>
                <dd><label>
                        <#if (dto.incretion)??>
                            <#if dto.incretion == "1">
                              是
                            <#elseif dto.incretion == "0">
                              否
                            </#if>
                        </#if>
                  </label></dd>
              </dl>
              <dl>
                <dt>是否用免疫：</dt>
                <dd><label>
                        <#if (dto.immunized)??>
                            <#if dto.immunized == "1">
                              是
                            <#elseif dto.immunized == "0">
                              否
                            </#if>
                        </#if>
                  </label></dd>
              </dl>
            <dl>
              <dt>全身治疗方案1：</dt>
              <dd><label style="width: 250px;">${(dto.holisticTx1)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案2：</dt>
              <dd><label style="width: 250px;">${(dto.holisticTx2)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案3：</dt>
              <dd><label style="width: 250px;">${(dto.holisticTx3)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案4：</dt>
              <dd><label style="width: 250px;">${(dto.holisticTx4)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案5：</dt>
              <dd><label style="width: 250px;">${(dto.holisticTx5)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案6：</dt>
              <dd><label style="width: 250px;">${(dto.holisticTx6)!}</label></dd>
            </dl>
            <dl>
              <dt>全身治疗方案7：</dt>
              <dd><label style="width: 250px;">${(dto.holisticTx7)!}</label></dd>
            </dl>
          </div>
        </div>
      </div>


      <div>
        <form class="required-validate" onsubmit="return saveItemCallback(this)" action="bloodtested/save?treatCourseId=${(dto.treatCourseId)!}" method="post">
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
              action="bloodtested/list?treatCourseId=${(dto.treatCourseId)!}" method="post">
            <#--      <input type="hidden" name="pageNum" value="${((page.pageIndex)!0)}"/>-->
            <#--      <input type="hidden" name="numPerPage" value="${(page.pageSize)!}"/>-->
        </form>

<#--        <div class="panelBar">-->
<#--          <ul class="toolBar">-->
<#--              <@shiro.hasPermission name="patient:add">-->
<#--                <li><a class="add" href="bloodtested/add?dtoId=${(dto.id)!}" target="dialog" rel="save"><span>添加</span></a></li>-->
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




