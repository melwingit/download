From devopsedu/webapp
ADD website /var/www/html
RUN rm /var/www/html/index.html
EXPOSE 8080
CMD apachectl -D FOREGROUND
