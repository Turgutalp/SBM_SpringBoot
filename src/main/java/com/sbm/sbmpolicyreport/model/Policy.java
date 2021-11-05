package com.sbm.sbmpolicyreport.model;
import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name= "POLICY")

public class Policy implements Serializable {


    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @Column(name="POLICY_TYPE")
    private String policy_type;

    @NotEmpty
    @Column(name="POLICY_PREMIUM")
    private BigDecimal policy_premium;

    @NotEmpty
    @Column(name="POLICY_PREMIUM_CURRENCY")
    private String policy_premium_currency;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="CREATE_DATE")
    private Date create_date;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPolicy_type() {
        return policy_type;
    }

    public void setPolicy_type(String policy_type) {
        this.policy_type = policy_type;
    }

    public BigDecimal getPolicy_premium() {
        return policy_premium;
    }

    public void setPolicy_premium(BigDecimal policy_premium) {
        this.policy_premium = policy_premium;
    }

    public String getPolicy_premium_currency(){
        return policy_premium_currency;
    }

    public void setPolicy_premium_currency(String policy_premium_currency){
        this.policy_premium_currency = policy_premium_currency;
    }

    public Date getCreate_date(){
        return create_date;
    }

    public void setCreate_date(Date create_date){
        this.create_date = create_date;
    }

}
