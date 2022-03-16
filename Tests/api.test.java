/addUser : POST
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("POST");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer /addUser");
http.setRequestProperty("Content-Type", "application/json");
http.setRequestProperty("Content-Length", "0");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/adminLogin : POST
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("POST");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer /adminLogin");
http.setRequestProperty("Content-Type", "application/json");
http.setRequestProperty("Content-Length", "0");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/forget_password : POST
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("POST");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer /forget_password");
http.setRequestProperty("Content-Type", "application/json");
http.setRequestProperty("Content-Length", "0");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/reset_password : POST
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("POST");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer /reset_password");
http.setRequestProperty("Content-Type", "application/json");
http.setRequestProperty("Content-Length", "0");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/login : POST
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("POST");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer /login");
http.setRequestProperty("Content-Type", "application/json");
http.setRequestProperty("Content-Length", "0");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/saveOrders : POST
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("POST");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer /saveOrders");
http.setRequestProperty("Content-Type", "application/json");
http.setRequestProperty("Content-Length", "0");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/placeOrders : POST
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("POST");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer /placeOrders");
http.setRequestProperty("Content-Type", "application/json");
http.setRequestProperty("Content-Length", "0");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/addProduct : POST
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("POST");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer /addProduct");
http.setRequestProperty("Content-Type", "application/json");
http.setRequestProperty("Content-Length", "0");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/admin/addProduct : POST
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("POST");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer /admin/addProduct");
http.setRequestProperty("Content-Type", "application/json");
http.setRequestProperty("Content-Length", "0");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/signup : POST
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("POST");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer /signup");
http.setRequestProperty("Content-Type", "application/json");
http.setRequestProperty("Content-Length", "0");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/updateUsers/{id} : PUT
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("PUT");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer /updateUsers/{id}");
http.setRequestProperty("Content-Type", "application/json");
http.setRequestProperty("Content-Length", "0");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/admin/productEdit/{id} : PUT
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("PUT");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer /admin/productEdit/{id}");
http.setRequestProperty("Content-Type", "application/json");
http.setRequestProperty("Content-Length", "0");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/updateOrder : PUT
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("PUT");
http.setDoOutput(true);
http.setRequestProperty("Authorization", "Bearer /updateOrder");
http.setRequestProperty("Content-Type", "application/json");
http.setRequestProperty("Content-Length", "0");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/deleteAllUser : DELETE
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("DELETE");
http.setRequestProperty("Authorization", "Bearer /deleteAllUser");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/deleteOrder/{id} : DELETE
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("DELETE");
http.setRequestProperty("Authorization", "Bearer /deleteOrder/{id}");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/multipledeleteOrder : DELETE
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("DELETE");
http.setRequestProperty("Authorization", "Bearer /multipledeleteOrder");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/admin/delete/{id} : DELETE
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("DELETE");
http.setRequestProperty("Authorization", "Bearer /admin/delete/{id}");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/multipledeleteProduct : DELETE
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("DELETE");
http.setRequestProperty("Authorization", "Bearer /multipledeleteProduct");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/deleteUsers/{id} : DELETE
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("DELETE");
http.setRequestProperty("Authorization", "Bearer /deleteUsers/{id}");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/userCount : GET
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestProperty("Authorization", "Bearer /userCount");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/orderCount : GET
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestProperty("Authorization", "Bearer /orderCount");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/revenue ; GET
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestProperty("Authorization", "Bearer /revenue");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/orderCompleted : GET
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestProperty("Authorization", "Bearer /orderCompleted");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/order/{id} : GET
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestProperty("Authorization", "Bearer /order/{id}");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/order : GET
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestProperty("Authorization", "Bearer /order");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/admin/orders : GET
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestProperty("Authorization", "Bearer /admin/orders");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/product/{id}: GET
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestProperty("Authorization", "Bearer /product/{id}");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/home : GET
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestProperty("Authorization", "Bearer /home");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/admin : GET
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestProperty("Authorization", "Bearer /admin");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();

/users : GET
URL url = new URL("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestProperty("Authorization", "Bearer /users");
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();