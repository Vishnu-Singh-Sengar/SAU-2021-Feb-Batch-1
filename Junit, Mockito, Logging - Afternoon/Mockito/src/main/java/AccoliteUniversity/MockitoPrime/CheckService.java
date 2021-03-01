package AccoliteUniversity.MockitoPrime;


public class CheckService {
	IsPrime obj;
	public boolean checkPrime(int num) {
		return obj.check(num);
	}
	public IsPrime getObj() {
		return obj;
	}
	public void setObj(IsPrime obj) {
		this.obj = obj;
	}

}
