package com.webmagic;

import us.codecraft.webmagic.Spider;

public class WebMagicDemo {
    public static void main(String[] args) {
        Spider.create(new GithubRepoPageProcessor()).addUrl("https://github/code4craft").thread(5);
    }
}
