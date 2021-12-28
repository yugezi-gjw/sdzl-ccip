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
    <dd><label>${(treatCourseChest.synchronous)!}</label></dd>
  </dl>
  <dl>
    <dt>放疗转移部位数量：</dt>
    <dd><label>${(treatCourseChest.metastasisSites)!}</label></dd>
  </dl>
  <dl>
    <dt>是否为多部位放疗：</dt>
    <dd><label>${(treatCourseChest.isMultiSites)!}</label></dd>
  </dl>
  <dl>
    <dt>有无肺部放疗：</dt>
    <dd><label>${(treatCourseChest.isPulmonaryRadiation)!}</label></dd>
  </dl>
  <dl>
    <dt>肺转移放疗：</dt>
    <dd><label style="width: 250px;">${(treatCourseChest.pulmonaryMetastasisRadiation)!}</label></dd>
  </dl>
  <dl>
    <dt>有无脑转移：</dt>
    <dd><label>${(treatCourseChest.isBrainMetastases)!}</label></dd>
  </dl>
  <dl>
    <dt>有无脑放疗：</dt>
    <dd><label>${(treatCourseChest.isBrainRadiation)!}</label></dd>
  </dl>
  <dl>
    <dt>脑转移放疗：</dt>
    <dd><label style="width: 250px;">${(treatCourseChest.brainMetastasisRadiation)!}</label></dd>
  </dl>
  <dl>
    <dt>有无骨转移：</dt>
    <dd><label>${(treatCourseChest.isBoneMetastases)!}</label></dd>
  </dl>
  <dl>
    <dt>有无骨放疗：</dt>
    <dd><label>${(treatCourseChest.isBoneRadiation)!}</label></dd>
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
    <dd><label>${(treatCourseChest.tki)!}</label></dd>
  </dl>
  <dl>
    <dt>Platinum doublet：</dt>
    <dd><label>${(treatCourseChest.platinumDoublet)!}</label></dd>
  </dl>
  <dl>
    <dt>是否用吉非替尼：</dt>
    <dd><label>${(treatCourseChest.gefitinib)!}</label></dd>
  </dl>
  <dl>
    <dt>是否用厄洛替尼：</dt>
    <dd><label>${(treatCourseChest.angiostatin)!}</label></dd>
  </dl>
  <dl>
    <dt>是否用埃克替尼：</dt>
    <dd><label>${(treatCourseChest.icotinib)!}</label></dd>
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
  <dl>
    <dt>备用字段1：</dt>
    <dd><label style="width: 250px;">${(treatCourseChest.backup1)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段2：</dt>
    <dd><label style="width: 250px;">${(treatCourseChest.backup2)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段3：</dt>
    <dd><label style="width: 250px;">${(treatCourseChest.backup3)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段4：</dt>
    <dd><label style="width: 250px;">${(treatCourseChest.backup4)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段5：</dt>
    <dd><label style="width: 250px;">${(treatCourseChest.backup5)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段6：</dt>
    <dd><label style="width: 250px;">${(treatCourseChest.backup6)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段7：</dt>
    <dd><label style="width: 250px;">${(treatCourseChest.backup7)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段8：</dt>
    <dd><label style="width: 250px;">${(treatCourseChest.backup8)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段9：</dt>
    <dd><label style="width: 250px;">${(treatCourseChest.backup9)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段10：</dt>
    <dd><label style="width: 250px;">${(treatCourseChest.backup10)!}</label></dd>
  </dl>