function fn() {
  var env = karate.env || 'dev';

  // 👇 Central place to control parallelism
  var threads = 3; // change this value only here

  var config = {
    env: env,
    baseUrl: 'https://reqres.in/api',
    defaultHeaders: {
      'Content-Type': 'application/json',
      'x-api-key': 'reqres-free-v1'
    },
    parallelThreads: threads
  };

  // Apply global headers and timeouts
  karate.configure('headers', config.defaultHeaders);
  karate.configure('ssl', true);
  karate.configure('connectTimeout', 10000);
  karate.configure('readTimeout', 20000);

  // 👇 Publish threads so Java runner can read it, regardless of Karate version
  java.lang.System.setProperty('karate.threads', String(threads));

  return config;
}
