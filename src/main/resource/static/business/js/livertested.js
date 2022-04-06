let selectedItemId;

function saveLiverTestedCallback(form) {
    return saveItemCallback(form, 'liverTestedForm', 'liverTestedDiv');
}

function deleteLiverTested() {
    if (!selectedItemId) {
        alertMsg.error(DWZ.msg("alertSelectMsg"));
        return;
    }
    let url = 'liver-tested/del?id=' + selectedItemId;

    alertMsg.confirm("确定要删除吗?", {
        okCall: function(){
            $.ajax({
                type: 'POST',
                url: url,
                dataType:"json",
                cache: false,
                success: function () {
                    divRefresh('liverTestedForm', 'liverTestedDiv');
                    selectedItemId = null;
                },
                error: DWZ.ajaxError
            });
        }
    });
}

function selectLiverTested(id) {
    selectedItemId = id;
}

