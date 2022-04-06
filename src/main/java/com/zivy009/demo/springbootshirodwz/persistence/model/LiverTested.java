package com.zivy009.demo.springbootshirodwz.persistence.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import java.util.Date;

@TableName("liver_tested")
public class LiverTested extends Model<LiverTested> implements Serializable {

  private static final long serialVersionUID = 1L;

  @TableId(value="id", type= IdType.AUTO)
  private Long id;

  @TableField("treat_course_id")
  private String treatCourseId;

  @TableField("prothrombin_time")
  private String prothrombinTime;//凝血酶原时间
  @TableField("prothrombin_activity")
  private String prothrombinActivity;//凝血酶原活动度
  @TableField("prothrombin_standard_ratio")
  private String prothrombinStandardRatio;//凝血酶原国际标准化比值
  @TableField("thrombin_time")
  private String thrombinTime;//凝血酶时间
  @TableField("thrombokinase_time")
  private String thrombokinaseTime;//活化部分凝血活酶时间
  private String fibrinogen;//纤维蛋白原
  @TableField("d_dimer")
  private String dDimer;//D-二聚体
  private String potassium;//钾
  private String natrium;//钠
  private String chlorin;//氯
  private String calcium;//钙
  private String magnesium;//镁
  private String phosphorus;//磷
  private String ferrumiron;//铁
  @TableField("co2_cohesion")
  private String co2Cohesion;//二氧化碳结合力
  private String aat;//丙氨酸氨基转移酶
  @TableField("aspartate_amino_transferase")
  private String aspartateAminoTransferase;//天门冬氨酸氨基转移酶
  @TableField("total_protein")
  private String totalProtein;//总蛋白
  @TableField("albumin")
  private String albumin;//白蛋白
  @TableField("total_bilirubin")
  private String totalBilirubin;//总胆红素
  @TableField("direct_bilirubin")
  private String directBilirubin;//直接胆红素
  @TableField("front_albumin")
  private String frontAlbumin;//前白蛋白
  @TableField("alkaline_phosphatase")
  private String alkalinePhosphatase;//碱性磷酸酶
  @TableField("adenosine_deaminase")
  private String adenosineDeaminase;//腺苷脱氨酶
  @TableField("glycocholic_acid")
  private String glycocholicAcid;//甘胆酸
  @TableField("glutamyl_transferase")
  private String glutamylTransferase;//y-谷氨酰基转移酶
  @TableField("acylneuraminate")
  private String acylneuraminate;//唾液酸
  @TableField("creatine_kinase")
  private String creatineKinase;//肌酸激酶
  @TableField("isoenzymes_creatine_kinase")
  private String isoenzymesCreatineKinase;//肌酸激酶同功酶
  @TableField("lactic_dehydrogenase")
  private String lacticDehydrogenase;//乳酸脱氢酶
  @TableField("a_hbd")
  private String aHbd;//a-羟丁酸脱氢酶
  @TableField("amylase")
  private String amylase;//淀粉酶
  @TableField("cholinesterase")
  private String cholinesterase;//胆碱脂酶
  @TableField("urea_nitrogen")
  private String ureaNitrogen;//尿素氮
  @TableField("creatinine")
  private String creatinine;//肌酐
  @TableField("uric_acid")
  private String uricAcid;//尿酸
  @TableField("microglobulin")
  private String microglobulin;//β2-微球蛋白
  @TableField("cystatin_c")
  private String cystatinC;//胱抑素C
  @TableField("glucose")
  private String glucose;//葡萄糖
  @TableField("total_cholesterin")
  private String totalCholesterin;//总胆固醇
  @TableField("triglyceride")
  private String triglyceride;//甘油三酯
  @TableField("hdl_ch")
  private String hdlCh;//高密度脂蛋白胆固醇
  @TableField("c_ldl")
  private String cLdl;//低密度脂蛋白胆固醇
  @TableField("free_fatty_acid")
  private String freeFattyAcid;//游离脂肪酸
  @TableField("small_c_ldl")
  private String smallCldl;//小而密低密度脂蛋白胆固醇
  @TableField("indirect_bilirubin")
  private String indirectBilirubin;//间接胆红素
  @TableField("globulin")
  private String globulin;//球蛋白
  @TableField("s_l")
  private String sl;//S/L
  @TableField("ag")
  private String ag;//阴离子间隙
  @TableField("albumin_globulin_ratio")
  private String albuminGlobulinRatio;//白球比
  @TableField("pro_bnp")
  private String proBnp;//B型钠尿肽前体
  @TableField("troponin_t")
  private String troponinT;//超敏肌钙蛋白T
  @TableField("c_antigen")
  private String cAntigen;//癌胚抗原
  @TableField("neure_nse")
  private String neureNse;//神经元特异性烯醇化酶
  @TableField("cytokeratin19")
  private String cytokeratin19;//细胞角蛋白19片段
  @TableField("grp_prosoma")
  private String grpProsoma;//胃泌素释放肽前体
  @TableField("epidermoid_carcinoma")
  private String epidermoidCarcinoma;//鳞状细胞癌相关抗原
  @TableField("ft3")
  private String ft3;//游离三碘甲状原氨酸
  @TableField("ft")
  private String ft;//游离甲状腺素
  @TableField("tsh")
  private String tsh;//促甲状腺激素
  @TableField("tga")
  private String tga;//甲状腺球蛋白抗体
  @TableField("thyroprotein")
  private String thyroprotein;//甲状腺球蛋白

  private String status;

  @TableField("created_at")
  private Date createdAt;

  @TableField("created_by")
  private String createdBy;

  @TableField("updated_at")
  private Date updatedAt;

  @TableField("updated_by")
  private String updatedBy;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTreatCourseId() {
    return treatCourseId;
  }

  public void setTreatCourseId(String treatCourseId) {
    this.treatCourseId = treatCourseId;
  }

  public String getProthrombinTime() {
    return prothrombinTime;
  }

  public void setProthrombinTime(String prothrombinTime) {
    this.prothrombinTime = prothrombinTime;
  }

  public String getProthrombinActivity() {
    return prothrombinActivity;
  }

  public void setProthrombinActivity(String prothrombinActivity) {
    this.prothrombinActivity = prothrombinActivity;
  }

  public String getProthrombinStandardRatio() {
    return prothrombinStandardRatio;
  }

  public void setProthrombinStandardRatio(String prothrombinStandardRatio) {
    this.prothrombinStandardRatio = prothrombinStandardRatio;
  }

  public String getThrombinTime() {
    return thrombinTime;
  }

  public void setThrombinTime(String thrombinTime) {
    this.thrombinTime = thrombinTime;
  }

  public String getThrombokinaseTime() {
    return thrombokinaseTime;
  }

  public void setThrombokinaseTime(String thrombokinaseTime) {
    this.thrombokinaseTime = thrombokinaseTime;
  }

  public String getFibrinogen() {
    return fibrinogen;
  }

  public void setFibrinogen(String fibrinogen) {
    this.fibrinogen = fibrinogen;
  }

  public String getdDimer() {
    return dDimer;
  }

  public void setdDimer(String dDimer) {
    this.dDimer = dDimer;
  }

  public String getPotassium() {
    return potassium;
  }

  public void setPotassium(String potassium) {
    this.potassium = potassium;
  }

  public String getNatrium() {
    return natrium;
  }

  public void setNatrium(String natrium) {
    this.natrium = natrium;
  }

  public String getChlorin() {
    return chlorin;
  }

  public void setChlorin(String chlorin) {
    this.chlorin = chlorin;
  }

  public String getCalcium() {
    return calcium;
  }

  public void setCalcium(String calcium) {
    this.calcium = calcium;
  }

  public String getMagnesium() {
    return magnesium;
  }

  public void setMagnesium(String magnesium) {
    this.magnesium = magnesium;
  }

  public String getPhosphorus() {
    return phosphorus;
  }

  public void setPhosphorus(String phosphorus) {
    this.phosphorus = phosphorus;
  }

  public String getFerrumiron() {
    return ferrumiron;
  }

  public void setFerrumiron(String ferrumiron) {
    this.ferrumiron = ferrumiron;
  }

  public String getCo2Cohesion() {
    return co2Cohesion;
  }

  public void setCo2Cohesion(String co2Cohesion) {
    this.co2Cohesion = co2Cohesion;
  }

  public String getAat() {
    return aat;
  }

  public void setAat(String aat) {
    this.aat = aat;
  }

  public String getAspartateAminoTransferase() {
    return aspartateAminoTransferase;
  }

  public void setAspartateAminoTransferase(String aspartateAminoTransferase) {
    this.aspartateAminoTransferase = aspartateAminoTransferase;
  }

  public String getTotalProtein() {
    return totalProtein;
  }

  public void setTotalProtein(String totalProtein) {
    this.totalProtein = totalProtein;
  }

  public String getAlbumin() {
    return albumin;
  }

  public void setAlbumin(String albumin) {
    this.albumin = albumin;
  }

  public String getTotalBilirubin() {
    return totalBilirubin;
  }

  public void setTotalBilirubin(String totalBilirubin) {
    this.totalBilirubin = totalBilirubin;
  }

  public String getDirectBilirubin() {
    return directBilirubin;
  }

  public void setDirectBilirubin(String directBilirubin) {
    this.directBilirubin = directBilirubin;
  }

  public String getFrontAlbumin() {
    return frontAlbumin;
  }

  public void setFrontAlbumin(String frontAlbumin) {
    this.frontAlbumin = frontAlbumin;
  }

  public String getAlkalinePhosphatase() {
    return alkalinePhosphatase;
  }

  public void setAlkalinePhosphatase(String alkalinePhosphatase) {
    this.alkalinePhosphatase = alkalinePhosphatase;
  }

  public String getAdenosineDeaminase() {
    return adenosineDeaminase;
  }

  public void setAdenosineDeaminase(String adenosineDeaminase) {
    this.adenosineDeaminase = adenosineDeaminase;
  }

  public String getGlycocholicAcid() {
    return glycocholicAcid;
  }

  public void setGlycocholicAcid(String glycocholicAcid) {
    this.glycocholicAcid = glycocholicAcid;
  }

  public String getGlutamylTransferase() {
    return glutamylTransferase;
  }

  public void setGlutamylTransferase(String glutamylTransferase) {
    this.glutamylTransferase = glutamylTransferase;
  }

  public String getAcylneuraminate() {
    return acylneuraminate;
  }

  public void setAcylneuraminate(String acylneuraminate) {
    this.acylneuraminate = acylneuraminate;
  }

  public String getCreatineKinase() {
    return creatineKinase;
  }

  public void setCreatineKinase(String creatineKinase) {
    this.creatineKinase = creatineKinase;
  }

  public String getIsoenzymesCreatineKinase() {
    return isoenzymesCreatineKinase;
  }

  public void setIsoenzymesCreatineKinase(String isoenzymesCreatineKinase) {
    this.isoenzymesCreatineKinase = isoenzymesCreatineKinase;
  }

  public String getLacticDehydrogenase() {
    return lacticDehydrogenase;
  }

  public void setLacticDehydrogenase(String lacticDehydrogenase) {
    this.lacticDehydrogenase = lacticDehydrogenase;
  }

  public String getaHbd() {
    return aHbd;
  }

  public void setaHbd(String aHbd) {
    this.aHbd = aHbd;
  }

  public String getAmylase() {
    return amylase;
  }

  public void setAmylase(String amylase) {
    this.amylase = amylase;
  }

  public String getCholinesterase() {
    return cholinesterase;
  }

  public void setCholinesterase(String cholinesterase) {
    this.cholinesterase = cholinesterase;
  }

  public String getUreaNitrogen() {
    return ureaNitrogen;
  }

  public void setUreaNitrogen(String ureaNitrogen) {
    this.ureaNitrogen = ureaNitrogen;
  }

  public String getCreatinine() {
    return creatinine;
  }

  public void setCreatinine(String creatinine) {
    this.creatinine = creatinine;
  }

  public String getUricAcid() {
    return uricAcid;
  }

  public void setUricAcid(String uricAcid) {
    this.uricAcid = uricAcid;
  }

  public String getMicroglobulin() {
    return microglobulin;
  }

  public void setMicroglobulin(String microglobulin) {
    this.microglobulin = microglobulin;
  }

  public String getCystatinC() {
    return cystatinC;
  }

  public void setCystatinC(String cystatinC) {
    this.cystatinC = cystatinC;
  }

  public String getGlucose() {
    return glucose;
  }

  public void setGlucose(String glucose) {
    this.glucose = glucose;
  }

  public String getTotalCholesterin() {
    return totalCholesterin;
  }

  public void setTotalCholesterin(String totalCholesterin) {
    this.totalCholesterin = totalCholesterin;
  }

  public String getTriglyceride() {
    return triglyceride;
  }

  public void setTriglyceride(String triglyceride) {
    this.triglyceride = triglyceride;
  }

  public String getHdlCh() {
    return hdlCh;
  }

  public void setHdlCh(String hdlCh) {
    this.hdlCh = hdlCh;
  }

  public String getcLdl() {
    return cLdl;
  }

  public void setcLdl(String cLdl) {
    this.cLdl = cLdl;
  }

  public String getFreeFattyAcid() {
    return freeFattyAcid;
  }

  public void setFreeFattyAcid(String freeFattyAcid) {
    this.freeFattyAcid = freeFattyAcid;
  }

  public String getSmallCldl() {
    return smallCldl;
  }

  public void setSmallCldl(String smallCldl) {
    this.smallCldl = smallCldl;
  }

  public String getIndirectBilirubin() {
    return indirectBilirubin;
  }

  public void setIndirectBilirubin(String indirectBilirubin) {
    this.indirectBilirubin = indirectBilirubin;
  }

  public String getGlobulin() {
    return globulin;
  }

  public void setGlobulin(String globulin) {
    this.globulin = globulin;
  }

  public String getSl() {
    return sl;
  }

  public void setSl(String sl) {
    this.sl = sl;
  }

  public String getAg() {
    return ag;
  }

  public void setAg(String ag) {
    this.ag = ag;
  }

  public String getAlbuminGlobulinRatio() {
    return albuminGlobulinRatio;
  }

  public void setAlbuminGlobulinRatio(String albuminGlobulinRatio) {
    this.albuminGlobulinRatio = albuminGlobulinRatio;
  }

  public String getProBnp() {
    return proBnp;
  }

  public void setProBnp(String proBnp) {
    this.proBnp = proBnp;
  }

  public String getTroponinT() {
    return troponinT;
  }

  public void setTroponinT(String troponinT) {
    this.troponinT = troponinT;
  }

  public String getcAntigen() {
    return cAntigen;
  }

  public void setcAntigen(String cAntigen) {
    this.cAntigen = cAntigen;
  }

  public String getNeureNse() {
    return neureNse;
  }

  public void setNeureNse(String neureNse) {
    this.neureNse = neureNse;
  }

  public String getCytokeratin19() {
    return cytokeratin19;
  }

  public void setCytokeratin19(String cytokeratin19) {
    this.cytokeratin19 = cytokeratin19;
  }

  public String getGrpProsoma() {
    return grpProsoma;
  }

  public void setGrpProsoma(String grpProsoma) {
    this.grpProsoma = grpProsoma;
  }

  public String getEpidermoidCarcinoma() {
    return epidermoidCarcinoma;
  }

  public void setEpidermoidCarcinoma(String epidermoidCarcinoma) {
    this.epidermoidCarcinoma = epidermoidCarcinoma;
  }

  public String getFt3() {
    return ft3;
  }

  public void setFt3(String ft3) {
    this.ft3 = ft3;
  }

  public String getFt() {
    return ft;
  }

  public void setFt(String ft) {
    this.ft = ft;
  }

  public String getTsh() {
    return tsh;
  }

  public void setTsh(String tsh) {
    this.tsh = tsh;
  }

  public String getTga() {
    return tga;
  }

  public void setTga(String tga) {
    this.tga = tga;
  }

  public String getThyroprotein() {
    return thyroprotein;
  }

  public void setThyroprotein(String thyroprotein) {
    this.thyroprotein = thyroprotein;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  @Override
  protected Serializable pkVal() {
    return this.id;
  }
}
