/**
 * Copyright (c) 2013-2016 Jens Deters http://www.jensd.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package de.jensd.fx.glyphs.materialicons;

import de.jensd.fx.glyphs.GlyphIcon;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import static de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView.TTF_PATH;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.text.Font;

/**
 *
 * @author Jens Deters (mail@jensd.de)
 */
public class MaterialIconView extends GlyphIcon<MaterialIcon> {

    public final static String TTF_PATH = "/de/jensd/fx/glyphs/materialicons/MaterialIcons-Regular.ttf";

    static {
        try {
            Font.loadFont(MaterialDesignIconView.class.getResource(TTF_PATH).openStream(), 10.0d);
        } catch (IOException ex) {
            Logger.getLogger(MaterialDesignIconView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public MaterialIconView(MaterialIcon icon) {
        super(MaterialIcon.class);
        setFont(new Font("", DEFAULT_ICON_SIZE));
        setIcon(icon);
    }

    public MaterialIconView() {
        this(MaterialIcon.ANDROID);
    }

    @Override
    public MaterialIcon getDefaultGlyph() {
        return MaterialIcon.ANDROID;
    }

}
