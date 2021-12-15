
<div class="pageContent">
  <form method="post" action="patient/list" class="pageForm" onsubmit="return navTabSearch(this);">
    <div class="pageFormContent" layoutH="58">
      <div class="unit">
        <label>患者姓名：</label>
        <input type="text" size="25" name="patientName" value="${(model.patientName)!}"/>
        <span class="inputInfo">关键字或全称</span>
      </div>
      <div class="unit">
        <label>住 院 号：</label>
        <input type="text" size="25" name="inpatientId" value="${(model.inpatientId)!}"/>
        <span class="inputInfo">住院号</span>
      </div>
      <div class="unit">
        <label>性    别：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="gender" value="${(model.gender)!}">
          <option value=""></option>
          <option value="1">男</option>
          <option value="2">女</option>
        </select>
      </div>
      <div class="unit">
        <label>身份证号：</label>
        <input type="text" size="25" name="nationalId" value="${(patientDto.nationalId)!}"/>
      </div>
      <div class="divider">divider</div>

      <div class="unit">
        <label>分   期：</label>
        <input name="stage" type="text" size="25" value="${(model.stage)!}"/>
      </div>
      <div class="unit">
        <label>EGFR基因突变：</label>
        <input name="egfr" type="text" size="25" value="${(model.egfr)!}"/>
      </div>
      <div class="unit">
        <label>准确诊断日期：</label>
        <input name="diagnosisDt" type="text" size="25" class="date" value="${(model.diagnosisDt)!}"/>
      </div>
      <div class="unit">
        <label>准确死亡日期：</label>
        <input name="deathDt" type="text" size="25" class="date" value="${(model.deathDt)!}"/>
      </div>
      <div class="unit">
        <label>最近一次住院：</label>
        <input name="lastInpatientDt" type="text" size="25" class="date" value="${(model.lastInpatientDt)!}"/>
      </div>
      <div class="unit">
        <label>准确OS：</label>
        <input name="accurateOs" type="text" size="25" value="${(model.accurateOs)!}"/>
      </div>
      <div class="unit">
        <label>生存状态：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="alive" value="${(model.alive)!}">
          <option value=""></option>
          <option value="0">生存</option>
          <option value="1">死亡</option>
        </select>
      </div>
      <div class="unit">
        <label>进展时间：</label>
        <input name="progressDt" type="text" size="25" class="date" value="${(model.progressDt)!}"/>
      </div>
      <div class="unit">
        <label>放疗次数：</label>
        <input name="deliveredFraction" type="text" size="25" value="${(model.deliveredFraction)!}"/>
      </div>
      <div class="unit">
        <label>治疗类型：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="treatType" value="${(model.treatType)!}">
          <option value=""></option>
          <option value="1">靶向先</option>
          <option value="2">放疗先</option>
          <option value="0">同步</option>
        </select>
      </div>
      <div class="unit">
        <label>是否同步放化疗：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="synchronous" value="${(model.synchronous)!}">
          <option value=""></option>
          <option value="1">是</option>
          <option value="0">否</option>
        </select>
      </div>
      <div class="unit">
        <label>放疗转移部位数量：</label>
        <input name="metastasisSites" type="text" size="25" value="${(model.metastasisSites)!}"/>
      </div>
      <div class="unit">
        <label>是否为多部位放疗：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="isMultiSites" value="${(model.isMultiSites)!}">
          <option value=""></option>
          <option value="1">是</option>
          <option value="0">否</option>
        </select>
      </div>
      <div class="unit">
        <label>有无肺部放疗：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="isPulmonaryRadiation" value="${(model.isPulmonaryRadiation)!}">
          <option value=""></option>
          <option value="1">有</option>
          <option value="0">无</option>
        </select>
      </div>
      <div class="unit">
        <label>肺转移放疗：</label>
        <input name="pulmonaryMetastasisRadiation" type="text" size="25" value="${(model.pulmonaryMetastasisRadiation)!}"/>
      </div>
      <div class="unit">
        <label>有无脑转移：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="isBrainMetastases" value="${(model.isBrainMetastases)!}">
          <option value=""></option>
          <option value="1">有</option>
          <option value="0">无</option>
        </select>
      </div>
      <div class="unit">
        <label>有无脑放疗：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="isBrainRadiation" value="${(model.isBrainRadiation)!}">
          <option value=""></option>
          <option value="1">有</option>
          <option value="0">无</option>
        </select>
      </div>
      <div class="unit">
        <label>脑转移放疗：</label>
        <input name="brainMetastasisRadiation" type="text" size="25" value="${(model.brainMetastasisRadiation)!}"/>
      </div>
      <div class="unit">
        <label>有无骨转移：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="isBoneMetastases" value="${(model.isBoneMetastases)!}">
          <option value=""></option>
          <option value="1">有</option>
          <option value="0">无</option>
        </select>
      </div>
      <div class="unit">
        <label>有无骨放疗：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="isBoneRadiation" value="${(model.isBoneRadiation)!}">
          <option value=""></option>
          <option value="1">有</option>
          <option value="0">无</option>
        </select>
      </div>
      <div class="unit">
        <label>骨转移放疗：</label>
        <input name="boneMetastasisRadiation" type="text" size="25" value="${(model.boneMetastasisRadiation)!}"/>
      </div>
      <div class="unit">
        <label>肾上腺转移放疗：</label>
        <input name="adrenalMetastasisRadiation" type="text" size="25" value="${(model.adrenalMetastasisRadiation)!}"/>
      </div>
      <div class="unit">
        <label>其他转移放疗：</label>
        <input name="otherMetastasisRadiation" type="text" size="25" value="${(model.otherMetastasisRadiation)!}"/>
      </div>
      <div class="unit">
        <label>胸放与诊断时间时序：</label>
        <input name="cmdTimeSeq" type="text" size="25" value="${(model.cmdTimeSeq)!}"/>
      </div>
      <div class="unit">
        <label>胸放与系统治疗时序：</label>
        <input name="cmsTimeSeq" type="text" size="25" value="${(model.cmsTimeSeq)!}"/>
      </div>
      <div class="unit">
        <label>放射性副反应：</label>
        <input name="sideReaction" type="text" size="25" value="${(model.sideReaction)!}"/>
      </div>
      <div class="unit">
        <label>TKI是否为一线用药：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="tki" value="${(model.tki)!}">
          <option value=""></option>
          <option value="1">是</option>
          <option value="0">否</option>
        </select>
      </div>
      <div class="unit">
        <label>Platinum doublet：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="platinumDoublet" value="${(model.platinumDoublet)!}">
          <option value=""></option>
          <option value="1">是</option>
          <option value="0">否</option>
        </select>
      </div>
      <div class="unit">
        <label>是否用吉非替尼：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="gefitinib" value="${(model.gefitinib)!}">
          <option value=""></option>
          <option value="1">是</option>
          <option value="0">否</option>
        </select>
      </div>
      <div class="unit">
        <label>是否用厄洛替尼：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="angiostatin" value="${(model.angiostatin)!}">
          <option value=""></option>
          <option value="1">是</option>
          <option value="0">否</option>
        </select>
      </div>
      <div class="unit">
        <label>是否用埃克替尼：</label>
        <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px" name="icotinib" value="${(model.icotinib)!}">
          <option value=""></option>
          <option value="1">是</option>
          <option value="0">否</option>
        </select>
      </div>
      <div class="unit">
        <label>全身治疗方案1：</label>
        <input name="holisticTx1" type="text" size="25" value="${(model.holisticTx1)!}"/>
      </div>
      <div class="unit">
        <label>全身治疗方案2：</label>
        <input name="holisticTx2" type="text" size="25" value="${(model.holisticTx2)!}"/>
      </div>
      <div class="unit">
        <label>全身治疗方案3：</label>
        <input name="holisticTx3" type="text" size="25" value="${(model.holisticTx3)!}"/>
      </div>
      <div class="unit">
        <label>全身治疗方案4：</label>
        <input name="holisticTx4" type="text" size="25" value="${(model.holisticTx4)!}"/>
      </div>
      <div class="unit">
        <label>全身治疗方案5：</label>
        <input name="holisticTx5" type="text" size="25" value="${(model.holisticTx5)!}"/>
      </div>
      <div class="unit">
        <label>全身治疗方案6：</label>
        <input name="holisticTx6" type="text" size="25" value="${(model.holisticTx6)!}"/>
      </div>
      <div class="unit">
        <label>全身治疗方案7：</label>
        <input name="holisticTx7" type="text" size="25" value="${(model.holisticTx7)!}"/>
      </div>
    </div>
    <div class="formBar">
      <ul>
        <li><div class="buttonActive"><div class="buttonContent"><button type="submit">开始检索</button></div></div></li>
        <li><div class="button"><div class="buttonContent"><button type="reset">清空重输</button></div></div></li>
      </ul>
    </div>
  </form>
</div>
