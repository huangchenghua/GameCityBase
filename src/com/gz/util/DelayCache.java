package com.gz.util;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

//import com.gz.gamecity.bean.Player;



/**
 *Cache.java
 *
 * Created on 2014-1-11 上午11:30:36 by sunzhenchao mychaoyue2011@163.com
 */
public class DelayCache<K, V extends TimeUpItem> {

    public ConcurrentHashMap<K, V> map = new ConcurrentHashMap<K, V>();
    public DelayQueue<DelayedItem<K>> queue = new DelayQueue<DelayedItem<K>>();
    
//    private static PlayerLoginCache<String, Player> instance;
    
    
    
//    public static synchronized PlayerLoginCache<String, Player> getInstance() {
//    	if(instance == null)
//    		instance=new PlayerLoginCache<String, Player>();
//		return instance;
//	}

	public void put(K k,V v,long liveTime){
        V v2 = map.put(k, v);
        DelayedItem<K> tmpItem = new DelayedItem<K>(k, liveTime);
        if (v2 != null) {
            queue.remove(tmpItem);
        }
        queue.put(tmpItem);
    }
	
	public V remove(K k){
		if(k!=null)
			return map.remove(k);
		return null;
	}
    
	public V getV(K key){
		return map.get(key);
	}
	
    public DelayCache(){
        Thread t = new Thread(){
            @Override
            public void run(){
                dameonCheckOverdueKey();
            }
        };
//        t.setDaemon(true);
        t.start();
    }
    
    public void dameonCheckOverdueKey(){
        while (true) {
        	try {
        		DelayedItem<K> delayedItem = queue.take();
                if (delayedItem != null) {
                	TimeUpItem item = map.remove(delayedItem.getT());
                	if(item!=null)
                		item.onTimeUp();
//                    System.out.println(System.currentTimeMillis()+" remove "+delayedItem.getT() +" from cache");
                }
			} catch (Exception e) {
				e.printStackTrace();
			}
            
        }
    }
    
    
//    public static void main(String[] args) throws InterruptedException {
//        
//        final DelayCache<String, Integer> cache = new DelayCache<String, Integer>();
//        
//        Thread t=new Thread(){
//        	@Override
//        	public void run() {
//        		int cacheNumber = 4;
//        		for (int i = 0; i < cacheNumber; i++) {
//                    long liveTime = 5*1000;
////                    System.out.println(i+"  "+liveTime);
//                    cache.put(i+"", i, liveTime);
//                    
//                    try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//                }
//        	}
//        };
//        
//        t.start();
//
//        
//        System.out.println();
//    }

}

class DelayedItem<T> implements Delayed{

    private T t;
    private final long expire;
    
    public DelayedItem(T t,long delay){
        this.setT(t);
        expire = System.currentTimeMillis() + delay;
//        System.out.println(t+"    "+expire);
    }
    
    @Override
    public int compareTo(Delayed o) {
    	DelayedItem di = (DelayedItem)o;  
        return expire-di.expire>0?1:0;  
    }

    @Override
    public long getDelay(TimeUnit unit) {
    	return expire - System.currentTimeMillis();
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    
}
