package com.gene.mobilemaster.model;

import java.util.Date;

public class Exceluploadlog {
    private Integer flowid;

    private String exceltype;

    private String formername;

    private String newname;

    private Date adddate;

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public String getExceltype() {
        return exceltype;
    }

    public void setExceltype(String exceltype) {
        this.exceltype = exceltype == null ? null : exceltype.trim();
    }

    public String getFormername() {
        return formername;
    }

    public void setFormername(String formername) {
        this.formername = formername == null ? null : formername.trim();
    }

    public String getNewname() {
        return newname;
    }

    public void setNewname(String newname) {
        this.newname = newname == null ? null : newname.trim();
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }
}