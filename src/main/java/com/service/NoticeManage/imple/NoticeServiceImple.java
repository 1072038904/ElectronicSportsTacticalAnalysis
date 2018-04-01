package com.service.NoticeManage.imple;

import com.dao.NoticeManage.NoticeDao;
import com.model.Notice;
import com.service.common.imple.BaseServiceImple;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class NoticeServiceImple extends BaseServiceImple<Notice>{
    private NoticeDao noticeDao;

    public NoticeDao getNoticeDao() {
        return noticeDao;
    }
    @Resource
    public void setNoticeDao(NoticeDao noticeDao) {
        this.setBaseDao(noticeDao);
        this.noticeDao = noticeDao;
    }
}
