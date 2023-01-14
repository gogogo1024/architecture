package com.example.demo.pattern.observer;

import java.util.List;

/**
 * 评论的主题（例如对某件事或者人）
 */
public class CommentaryObject implements Subject, Commentary {

    private final List<Observer> observers;
    private final String subjectDetails;
    private String desc;

    public CommentaryObject(List<Observer> observers, String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }

    /**
     * 设置评论
     *
     * @param desc 评论
     */
    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObservers();

    }

    /**
     * 订阅观察者
     *
     * @param observer 观察者
     */
    @Override
    public void subscribeObserver(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * 取消订阅观察者
     *
     * @param observer 观察者
     */
    @Override
    public void unSubscribeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * 提醒观察者
     */
    @Override
    public void notifyObservers() {
        System.out.println();
        for (Observer observer : this.observers) {
            observer.update(desc);
        }

    }

    /**
     * 对象详情
     *
     * @return 返回对象详情
     */
    @Override
    public String subjectDetails() {
        return subjectDetails;
    }
}
