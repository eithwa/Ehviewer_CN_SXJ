package com.hippo.ehviewer.dao;

import org.greenrobot.greendao.annotation.*;
import android.os.Parcel;
import com.hippo.ehviewer.client.data.GalleryInfo;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import java.util.ArrayList;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "DOWNLOADS".
 */
@Entity(nameInDb = "DOWNLOADS")
public class DownloadInfo extends GalleryInfo {

	public int state;
	public int legacy;
	public long time;
	public String label;

	public static final Creator<DownloadInfo> CREATOR = new Creator<DownloadInfo>() {
		@Override
		public DownloadInfo createFromParcel(Parcel source) {
			return new DownloadInfo(source);
		}

		@Override
		public DownloadInfo[] newArray(int size) {
			return new DownloadInfo[size];
		}
	};
	public static final int STATE_INVALID = -1;
	public static final int STATE_NONE = 0;
	public static final int STATE_WAIT = 1;
	public static final int STATE_DOWNLOAD = 2;
	public static final int STATE_FINISH = 3;
	public static final int STATE_FAILED = 4;
	public static final int STATE_UPDATE = 5;
	public static final int GOTO_NEW = 6;
	public long speed;
	public long remaining;
	public int finished;
	public int downloaded;
	public int total;

	@Generated
	public DownloadInfo() {
	}

	public DownloadInfo(long gid) {
		this.gid = gid;
	}

	@Generated
	public DownloadInfo(long gid, String token, String title, String titleJpn, String thumb, int category,
			String posted, String uploader, float rating, String simpleLanguage, int state, int legacy, long time,
			String label) {
		this.gid = gid;
		this.token = token;
		this.title = title;
		this.titleJpn = titleJpn;
		this.thumb = thumb;
		this.category = category;
		this.posted = posted;
		this.uploader = uploader;
		this.rating = rating;
		this.simpleLanguage = simpleLanguage;
		this.state = state;
		this.legacy = legacy;
		this.time = time;
		this.label = label;
	}

	public long getGid() {
		return gid;
	}

	public void setGid(long gid) {
		this.gid = gid;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleJpn() {
		return titleJpn;
	}

	public void setTitleJpn(String titleJpn) {
		this.titleJpn = titleJpn;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getPosted() {
		return posted;
	}

	public void setPosted(String posted) {
		this.posted = posted;
	}

	public String getUploader() {
		return uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getSimpleLanguage() {
		return simpleLanguage;
	}

	public void setSimpleLanguage(String simpleLanguage) {
		this.simpleLanguage = simpleLanguage;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getLegacy() {
		return legacy;
	}

	public void setLegacy(int legacy) {
		this.legacy = legacy;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		super.writeToParcel(dest, flags);
		dest.writeInt(this.state);
		dest.writeInt(this.legacy);
		dest.writeLong(this.time);
		dest.writeString(this.label);
	}

	protected DownloadInfo(Parcel in) {
		super(in);
		this.state = in.readInt();
		this.legacy = in.readInt();
		this.time = in.readLong();
		this.label = in.readString();
	}

	public DownloadInfo(GalleryInfo galleryInfo) {
		this.gid = galleryInfo.gid;
		this.token = galleryInfo.token;
		this.title = galleryInfo.title;
		this.titleJpn = galleryInfo.titleJpn;
		this.thumb = galleryInfo.thumb;
		this.category = galleryInfo.category;
		this.posted = galleryInfo.posted;
		this.uploader = galleryInfo.uploader;
		this.rating = galleryInfo.rating;
		this.simpleTags = galleryInfo.simpleTags;
		this.simpleLanguage = galleryInfo.simpleLanguage;
	}

	public JSONObject toJson() {
		JSONObject jsonObject = super.toJson();
		jsonObject.put("finished", finished);
		jsonObject.put("legacy", legacy);
		jsonObject.put("label", label);
		jsonObject.put("downloaded", downloaded);
		jsonObject.put("remaining", remaining);
		jsonObject.put("speed", speed);
		jsonObject.put("state", state);
		jsonObject.put("time", time);
		jsonObject.put("total", total);
		return jsonObject;
	}

	public static DownloadInfo downloadInfoFromJson(JSONObject object) {
		DownloadInfo downloadInfo = (DownloadInfo) GalleryInfo.galleryInfoFromJson(object);
		downloadInfo.finished = object.getIntValue("finished");
		downloadInfo.legacy = object.getIntValue("legacy");
		downloadInfo.label = object.getString("label");
		downloadInfo.downloaded = object.getIntValue("downloaded");
		downloadInfo.remaining = object.getLongValue("remaining");
		downloadInfo.speed = object.getLongValue("speed");
		downloadInfo.state = object.getIntValue("state");
		downloadInfo.time = object.getLongValue("time");
		downloadInfo.total = object.getIntValue("total");
		return downloadInfo;
	}

}
