package com.callor.memo.exec;

import com.callor.memo.service.impl.MemoServiceImplV1;

public class MemoExecA {

	public static void main(String[] args) {
		MemoServiceImplV1 memoService = new MemoServiceImplV1();
		
		memoService.insertMemo();
	}
}
