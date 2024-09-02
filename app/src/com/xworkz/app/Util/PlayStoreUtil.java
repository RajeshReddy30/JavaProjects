package com.xworkz.app.Util;

import com.xworkz.app.Dto.PlayStoreDto;

public class PlayStoreUtil {
	public static boolean checkDuplicates(PlayStoreDto play[],PlayStoreDto dto) {
		System.out.println("duplicate check");
		for(PlayStoreDto playStore:play) {
			if(playStore!=null && playStore.equals(dto))
				return true;
		}
		return false;
	}

}
