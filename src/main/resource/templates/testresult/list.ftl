<div>
  <div id="testResultDiv" class="pageContent">
    <table class="table" width="100%" layoutH="158" addButton="新建">
      <thead>
      <tr>
        <th>检查所见</th>
        <th>检查结果</th>
        <th>影像号</th>
        <th>影像评估</th>
        <th>检测时间</th>
        <th>备注</th>
        <th>操作</th>
      </tr>
      </thead>
      <tbody>
      <#if testResultList?? && (testResultList?size > 0)>
          <#list testResultList as dto>
            <td>${dto.finding!}</td>
            <td>${dto.result!}</td>
            <td>${dto.imageNumber!}</td>
            <td>${dto.imageEvaluation!}</td>
            <td>${dto.testDt!}</td>
            <td>${dto.comment!}</td>
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