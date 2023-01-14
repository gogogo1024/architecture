package com.example.demo.pattern.observer;

/**
 * 对象接口
 */
public interface Subject {
    /**
     * 订阅观察者
     *
     * @param observer 观察者
     */
    public void subscribeObserver(Observer observer);

    /**
     * 取消订阅观察者
     *
     * @param observer 观察者
     */
    public void unSubscribeObserver(Observer observer);

    /**
     * 提醒观察者
     */
    public void notifyObservers();

    /**
     * 对象详情
     *
     * @return 返回对象详情
     */
    public String subjectDetails();
}
