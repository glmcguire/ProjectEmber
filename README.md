# ProjectEmber

Sample project for Jedis, that will connect to both MySql DB and Redis. The goal is to have it copy and cache complete tables from MySQL into Redis, allowing for queries to be perfomed straight to Redis instead of MySQL. Following successful cloning of MySQL into Redis, the next stage will be to have every query update MySQL, when performed on redis.
