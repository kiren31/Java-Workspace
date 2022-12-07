package com.kh.practice.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.asc.AscTitle;
import com.kh.practice.model.vo.Music;

public class MusicController {
	
	private List<Music> list = new ArrayList();
	
	public int addList(Music music) {
		int result = 0;
		try {
			list.add(music);
			result = 1;
		} catch(Exception e) {
			result = 0;
		}
		return result;
	}
	
	public int addAtZero(Music music) {
		int result = 0;
		try {
			list.add(0 , music);
			result = 1;
		} catch(Exception e) {
			result = 0;
		}
		return result;
		
	}
	
	public List printAll() {
		return list;
		
	}
	
	public Music searchMusic(String title) {
		Music m = null;
		
		for(Music music : list) {
			if(music.getTitle().equals(title)) {
				m = music;
				break;
			}
		}
		
		return m;
	}
	
	public Music removeMusic(String title) {
		Music m = null;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				// 삭제해야할 Music객체
				m = list.remove(i);
				break;
			}
		}
		
		return m;
	}
	
	public Music setMusic(String title, Music music) {
		Music m = null;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				m = list.set(i, music);
			}
			
		}
		
		return m;
		
	}
	
	public int ascTitle() {
		Collections.sort(list);
		return 1;
		
	}
	
	public int descSinger() {
		Collections.sort(list, new AscTitle());
		return 1;
		
		
	}
	
	
	
	
}