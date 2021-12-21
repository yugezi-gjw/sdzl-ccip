function divRefresh(formId, rel) {
    var $form = $("#" + formId);
    // if ($form[DWZ.pageInfo.pageNum]) $form[DWZ.pageInfo.pageNum].value = 1;
    if (rel) {
        var $box = $("#" + rel);
        $box.ajaxUrl({
            type: "POST",
            url: $form.attr("action"),
            data: $form.serializeArray(),
            callback: function () {
                $box.find("[layoutH]").layoutH();
            }
        });
    }
    return false;
}