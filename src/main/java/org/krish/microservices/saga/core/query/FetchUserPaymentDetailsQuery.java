package org.krish.microservices.saga.core.query;

import lombok.Data;

@Data
public class FetchUserPaymentDetailsQuery {
	private String userId;
}
