package com.xworkz.payment.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "payment_details")
public class PaymentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "p_id")
	private int id;
	@Column(name = "p_receiverName")
	private String recieverName;
	@Column(name = "p_recieverPhoneNumber")
	private long recieverPhoneNumber;
	@Column(name = "p_amount")

	private int amount;
	@Column(name = "p_transactionId")

	private String transactionId;
	@Column(name = "p_paymentMethod")

	private String paymentMethod;
	@Column(name = "p_transactionDate")

	private String transactionDate;
	@Column(name = "p_createdBy")

	private String createdBy;
	@Column(name = "p_createdOn")

	private LocalDateTime createdOn;

}
