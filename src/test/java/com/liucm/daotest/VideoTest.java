package com.liucm.daotest;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.liucm.ApplicationTest;
import com.liucm.bean.Video;
import com.liucm.dao.VideoMapper;

public class VideoTest extends ApplicationTest {

	@Autowired
	private VideoMapper videoMapper;

	@Test
	public void TestSelectOneByVideoId() {
		System.out.println(videoMapper.selectOneByVideoId(1));
	}

	@Test
	public void TestInsertVideo() {
		Video video = videoMapper.selectOneByVideoId(1);
		videoMapper.insertVideo(video);
		videoMapper.insertVideo(video);
		videoMapper.insertVideo(video);
		videoMapper.insertVideo(video);videoMapper.insertVideo(video);
		System.out.println(video.getVideoId());
	}

	@Test
	public void TestsSelectVideo() {
		int count = videoMapper.selectVideoCount();
		System.out.println(count);

		List<Video> videos = videoMapper.selectVideoByPPNum(3);
		for (Video video : videos) {
			System.out.println(video);
		}
	}
}
