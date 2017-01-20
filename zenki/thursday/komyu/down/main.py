#!/usr/bin/python3
import requests
from bs4 import BeautifulSoup
from selenium.webdriver import Firefox

b = Firefox()
b.get("https://service.cloud.teu.ac.jp/moodle/course/view.php?id=7661")

soup = BeautifulSoup(b.page_source, "html.parser")
print(soup.find_all("a"))
b.close()
