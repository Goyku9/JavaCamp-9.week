package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.VerificationCodeService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.AuthenticationCodeDao;
import kodlamaio.hrms.entities.concretes.AuthenticationCode;

@Service
public class VerificationCodeManager implements VerificationCodeService{

	private AuthenticationCodeDao authenticationCodeDao;
	
	@Autowired
	public VerificationCodeManager(AuthenticationCodeDao authenticationCodeDao) {
		super();
		this.authenticationCodeDao = authenticationCodeDao;
	}

	@Override
	public Result add(AuthenticationCode code) {
		this.authenticationCodeDao.save(code);
		return new SuccessResult("Kod kaydedildi.");
	}

}