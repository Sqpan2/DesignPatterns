package com.mashibing.dp.thread;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10, new ThreadFactory() {
            //自定义Thread创建工厂类
            public Thread newThread(Runnable r) {
                return null;
            }
        });

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                10,                         //核心线程数
                20,                     //最大线程数
                10,                        //非核心线程数保留时间
                TimeUnit.SECONDS,                      //保留时间单位
                new LinkedBlockingQueue<Runnable>(),   //任务队列
                new ThreadFactory() {                   //线程创建工厂类,用于自定义线程的属性
                    public Thread newThread(Runnable r) {
                        return null;
                    }
                },
                new ThreadPoolExecutor.AbortPolicy()); //线程数满,任务队列满时线程池的拒绝策略，总共4种
    }
}
