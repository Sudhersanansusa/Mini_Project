package com.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_concept {

	@Test
	public void log_in() {

		String A = "Susa6996";

		String B = "susa6996";

		Assert.assertEquals(B, A);

	}

	@Test
	public void password() {

		String A = "6996";

		String B = "6996";

		Assert.assertEquals(B, A);

	}

}
