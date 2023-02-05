package com.eth.form.flow;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CreaterFlowForm {
    @ApiModelProperty("产品编号")
    private String prodId;

    @ApiModelProperty("产品名称")
    private String prodName;

    @ApiModelProperty("产品类别")
    private String category;

    @ApiModelProperty("生产商")
    private String deptName;

    @ApiModelProperty("计量单位")
    private String unit;

    @ApiModelProperty("操作人")
    private String operatorName;

    @ApiModelProperty("联系电话")
    private String phone;

    @ApiModelProperty("文件链接列表")
    private String fileUrlList;

    @ApiModelProperty("文件摘要列表")
    private String fileSHA256List;

    @ApiModelProperty("数量")
    private String num;

    @ApiModelProperty("源产地")
    private String origin;

    @ApiModelProperty("保质期")
    private String quality;
}
