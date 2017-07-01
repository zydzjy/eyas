package eyas.base.service;

public class ServiceException extends Exception{
	
	public final static int DAO_EXCEPTION_MYBATIS_BASE = 1001;
	public final static int DAO_EXCEPTION_NO_INSTANCE = 1002;
	public int typeId;
	public ServiceException(int typeId,String msg){
		super(msg);
		this.typeId = typeId;
	}
}
