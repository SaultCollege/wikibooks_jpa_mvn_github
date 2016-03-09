/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.byfc.wikibooks_jpa._07_entities.embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author malexander
 */
@Embeddable
public class EmploymentPeriod {
  @Column(name="START_DATE")
  private java.sql.Date startDate;

  @Column(name="END_DATE")
  private java.sql.Date endDate;

    public EmploymentPeriod() {
        
    }

    /**
     * @return the startDate
     */
    public java.sql.Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(java.sql.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public java.sql.Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(java.sql.Date endDate) {
        this.endDate = endDate;
    }

}