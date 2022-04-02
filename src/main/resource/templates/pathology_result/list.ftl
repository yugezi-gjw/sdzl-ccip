<div>
  <div id="pathologyResultDiv" class="pageContent">
    <table class="table" width="100%" layoutH="158" addButton="新建">
      <thead>
      <tr>
        <th>肉眼所见</th>
        <th>病理诊断</th>
        <th>补充病理诊断</th>
        <th>免疫组化</th>
        <th>病理号</th>
        <th>病理类型</th>
        <th>来源</th>
        <th>操作</th>
      </tr>
      </thead>
      <tbody>
      <#if pathologyResultList?? && (pathologyResultList?size > 0)>
          <#list pathologyResultList as dto>
            <td>${dto.finding!}</td>
            <td>${dto.diagnosis!}</td>
            <td>${dto.additionalDiagnosis!}</td>
            <td>${dto.immunity!}</td>
            <td>${dto.pathologyNumber!}</td>
            <td>${dto.pathologyType!}</td>
            <td>
                <#if (dto.pathologySource)?? && dto.pathologySource == "self">
                  本院
                <#elseif (dto.pathologySource)?? && dto.pathologySource == "other">
                  外院
                </#if>
            </td>
            <td>
              <a class="delete" onclick="deleteTestResult('${dto.id}');" title="确定要删除吗?"><span>删除</span></a>
            </td>
            </tr>
          </#list>
      </#if>
      </tbody>
    </table>
  </div>
</div>