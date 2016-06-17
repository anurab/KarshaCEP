package com.lsf.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock_MinimaMaxima {
	String Date;
	Double PRC,RET,PseudoPRC,PseudoPRCn,Turnover,PseudoPRC_hack,PreMin,PriMinRow,PostMin,PostMinRow,WindowMax;
	int SHROUT,VOL,RawVol;
	boolean Split,Ismax,IsBoom,IsBust,IsLocalTop;
	@Id
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public Double getPRC() {
		return PRC;
	}
	public void setPRC(Double pRC) {
		PRC = pRC;
	}
	public Double getRET() {
		return RET;
	}
	public boolean getSplit(){
		return Split;
	}
	public void setRET(Double rET) {
		RET = rET;
	}
	public Double getPseudoPRC() {
		return PseudoPRC;
	}
	public void setPseudoPRC(Double pseudoPRC) {
		PseudoPRC = pseudoPRC;
	}
	public Double getPseudoPRCn() {
		return PseudoPRCn;
	}
	public void setPseudoPRCn(Double pseudoPRCn) {
		PseudoPRCn = pseudoPRCn;
	}
	public Double getTurnover() {
		return Turnover;
	}
	public void setTurnover(Double turnover) {
		Turnover = turnover;
	}
	public Double getPseudoPRC_hack() {
		return PseudoPRC_hack;
	}
	public void setPseudoPRC_hack(Double pseudoPRC_hack) {
		PseudoPRC_hack = pseudoPRC_hack;
	}
	public Double getPreMin() {
		return PreMin;
	}
	public void setPreMin(Double preMin) {
		PreMin = preMin;
	}
	public Double getPriMinRow() {
		return PriMinRow;
	}
	public void setPriMinRow(Double priMinRow) {
		PriMinRow = priMinRow;
	}
	public Double getPostMin() {
		return PostMin;
	}
	public void setPostMin(Double postMin) {
		PostMin = postMin;
	}
	public Double getPostMinRow() {
		return PostMinRow;
	}
	public void setPostMinRow(Double postMinRow) {
		PostMinRow = postMinRow;
	}
	public Double getWindowMax() {
		return WindowMax;
	}
	public void setWindowMax(Double windowMax) {
		WindowMax = windowMax;
	}
	public int getSHROUT() {
		return SHROUT;
	}
	public void setSHROUT(int sHROUT) {
		SHROUT = sHROUT;
	}
	public int getVOL() {
		return VOL;
	}
	public void setVOL(int vOL) {
		VOL = vOL;
	}
	public int getRawVol() {
		return RawVol;
	}
	public void setRawVol(int rawVol) {
		RawVol = rawVol;
	}
	public boolean isSplit() {
		return Split;
	}
	public void setSplit(boolean split) {
		Split = split;
	}
	public boolean isIsmax() {
		return Ismax;
	}
	public void setIsmax(boolean ismax) {
		Ismax = ismax;
	}
	public boolean isIsBoom() {
		return IsBoom;
	}
	public void setIsBoom(boolean isBoom) {
		IsBoom = isBoom;
	}
	public boolean isIsBust() {
		return IsBust;
	}
	public void setIsBust(boolean isBust) {
		IsBust = isBust;
	}
	public boolean isIsLocalTop() {
		return IsLocalTop;
	}
	public void setIsLocalTop(boolean isLocalTop) {
		IsLocalTop = isLocalTop;
	}
	
	
}
