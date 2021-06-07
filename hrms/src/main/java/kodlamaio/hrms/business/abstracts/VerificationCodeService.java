package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.AuthenticationCode;

public interface VerificationCodeService {
	
	Result add(AuthenticationCode code);

}
