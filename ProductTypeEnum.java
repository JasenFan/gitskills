package com.lixiangxue.enums;

import com.lixiangxue.enums.ActivitiTypesEnum;

public enum ProductTypeEnum {
     abc(0,"0",0),
	// 二次分期
    CASH(2, "理享+", ActivitiTypesEnum.APPROVE),

    EDU_LOAN(1, "教育分期", ActivitiTypesEnum.LEARN),

    IOU(3, "芝士白条", ActivitiTypesEnum.IOU);
11111111111111111111111
    ProductTypeEnum(int id, String text, ActivitiTypesEnum activitiType) {
        this.id = id;
        this.text = text;
        this.activitiType = activitiType;
    }

    private int id;

    private String text;

    private ActivitiTypesEnum activitiType;

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public ActivitiTypesEnum getActivitiType() {
        return activitiType;
    }

    public static ProductTypeEnum parseTypeById(int id) {
        for (ProductTypeEnum type : ProductTypeEnum.values()) {
            if (type.getId() == id) {
                return type;
            }
        }
        return null;
    }
    public static String parseTextById(int id) {
        for (ProductTypeEnum type : ProductTypeEnum.values()) {
            if (type.getId() == id) {
                return type.getText();
            }
        }
        return null;
    }
}
