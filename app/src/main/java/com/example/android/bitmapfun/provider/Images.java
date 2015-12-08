/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bitmapfun.provider;

import com.example.android.bitmapfun.util.ImageWorker.ImageWorkerAdapter;

/**
 * Some simple test data to use for this sample app.
 */
public class Images {

    /**
     * 添加一小点注释~~~谢谢
     * This are PicasaWeb URLs and could potentially change. Ideally the PicasaWeb API should be
     * used to fetch the URLs.
     */
    public final static String[] imageUrls = new String[] {
        "http://img.article.pchome.net/00/35/62/34/pic_lib/wm/Zhiwu37.jpg",
        "http://img0.imgtn.bdimg.com/it/u=2339269058,1783030834&fm=21&gp=0.jpg",
        "http://img4.duitang.com/uploads/blog/201401/11/20140111172239_NvZ43.jpeg",
        "http://img5.duitang.com/uploads/blog/201401/11/20140111172105_sXUky.jpeg",
            "http://img.article.pchome.net/00/35/62/34/pic_lib/wm/Zhiwu37.jpg",
            "http://img0.imgtn.bdimg.com/it/u=2339269058,1783030834&fm=21&gp=0.jpg",
            "http://img4.duitang.com/uploads/blog/201401/11/20140111172239_NvZ43.jpeg",
            "http://img5.duitang.com/uploads/blog/201401/11/20140111172105_sXUky.jpeg",
            "http://a.hiphotos.baidu.com/zhidao/pic/item/0ff41bd5ad6eddc4d135d4743bdbb6fd5366336a.jpg",
            "http://img5q.duitang.com/uploads/blog/201401/11/20140111182531_LMFR5.jpeg",
            "http://www.bz55.com/uploads/allimg/150309/139-150309101A8.jpg",
            "http://www.33.la/uploads/201405sy/xiaoxi/32.jpg",
            "http://pic38.nipic.com/20140215/12359647_224250202132_2.jpg",

            "http://img2.imgtn.bdimg.com/it/u=582178319,1614651747&fm=21&gp=0.jpg",
            "http://b.zol-img.com.cn/desk/bizhi/image/1/960x600/1349947347213.jpeg",
            "http://img2.imgtn.bdimg.com/it/u=3745428640,438000328&fm=21&gp=0.jpg",
            "http://img.pconline.com.cn/images/upload/upc/tx/wallpaper/1307/23/c0/23655860_1374563879240.jpg"

    };

    /**
     * This are PicasaWeb thumbnail URLs and could potentially change. Ideally the PicasaWeb API
     * should be used to fetch the URLs.
     */
    public final static String[] imageThumbUrls = new String[] {
            "http://img.article.pchome.net/00/35/62/34/pic_lib/wm/Zhiwu37.jpg",
            "http://img0.imgtn.bdimg.com/it/u=2339269058,1783030834&fm=21&gp=0.jpg",
            "http://img4.duitang.com/uploads/blog/201401/11/20140111172239_NvZ43.jpeg",
            "http://img5.duitang.com/uploads/blog/201401/11/20140111172105_sXUky.jpeg",
            "http://img.article.pchome.net/00/35/62/34/pic_lib/wm/Zhiwu37.jpg",
            "http://img0.imgtn.bdimg.com/it/u=2339269058,1783030834&fm=21&gp=0.jpg",
            "http://img4.duitang.com/uploads/blog/201401/11/20140111172239_NvZ43.jpeg",
            "http://img5.duitang.com/uploads/blog/201401/11/20140111172105_sXUky.jpeg",
            "http://a.hiphotos.baidu.com/zhidao/pic/item/0ff41bd5ad6eddc4d135d4743bdbb6fd5366336a.jpg",
            "http://img5q.duitang.com/uploads/blog/201401/11/20140111182531_LMFR5.jpeg",
            "http://www.bz55.com/uploads/allimg/150309/139-150309101A8.jpg",
            "http://www.33.la/uploads/201405sy/xiaoxi/32.jpg",
            "http://pic38.nipic.com/20140215/12359647_224250202132_2.jpg",
            "http://img2.imgtn.bdimg.com/it/u=582178319,1614651747&fm=21&gp=0.jpg",
            "http://b.zol-img.com.cn/desk/bizhi/image/1/960x600/1349947347213.jpeg",
            "http://img2.imgtn.bdimg.com/it/u=3745428640,438000328&fm=21&gp=0.jpg",
            "http://img.pconline.com.cn/images/upload/upc/tx/wallpaper/1307/23/c0/23655860_1374563879240.jpg"


    };

    /**
     * Simple static adapter to use for images.
     */
    public final static ImageWorkerAdapter imageWorkerUrlsAdapter = new ImageWorkerAdapter() {
        @Override
        public Object getItem(int num) {
            return Images.imageUrls[num];
        }

        @Override
        public int getSize() {
            return Images.imageUrls.length;
        }
    };

    /**
     * Simple static adapter to use for image thumbnails.
     */
    public final static ImageWorkerAdapter imageThumbWorkerUrlsAdapter = new ImageWorkerAdapter() {
        @Override
        public Object getItem(int num) {
            return Images.imageThumbUrls[num];
        }

        @Override
        public int getSize() {
            return Images.imageThumbUrls.length;
        }
    };
}
